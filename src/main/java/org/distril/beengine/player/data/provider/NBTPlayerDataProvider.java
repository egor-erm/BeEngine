package org.distril.beengine.player.data.provider;

import com.nukkitx.math.vector.Vector3f;
import com.nukkitx.nbt.NbtMap;
import com.nukkitx.nbt.NbtUtils;
import lombok.extern.log4j.Log4j2;
import org.distril.beengine.player.data.GameMode;
import org.distril.beengine.player.data.PlayerData;
import org.distril.beengine.server.Server;
import org.distril.beengine.world.util.Location;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

@Log4j2
public class NBTPlayerDataProvider implements PlayerDataProvider {

	@Override
	public void save(UUID uuid, PlayerData data) {
		var playerFile = this.resolvePlayerNBTFile(uuid);
		if (playerFile.exists() && !playerFile.delete()) {
			log.error("Failed to save data of {}. Failed to delete existing player data file", uuid);
		}

		try (var writer = NbtUtils.createWriter(new FileOutputStream(playerFile))) {
			writer.writeTag(this.createPlayerSaveData(data));
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	@Override
	public PlayerData load(UUID uuid) throws IOException {
		var playerFile = this.resolvePlayerNBTFile(uuid);

		PlayerData playerData = new PlayerData();
		if (playerFile.exists()) {
			try (var reader = NbtUtils.createReader(new FileInputStream(playerFile))) {
				playerData = this.readPlayerData((NbtMap) reader.readTag());
			}
		}

		return playerData;
	}

	private File resolvePlayerNBTFile(UUID uuid) {
		return Path.of("players", uuid.toString() + ".dat").toFile();
	}

	private NbtMap createPlayerSaveData(PlayerData data) {
		var location = data.getLocation();
		return NbtMap.builder()
				.putFloat("pitch", data.getPitch())
				.putFloat("yaw", data.getYaw())
				.putFloat("headYaw", data.getHeadYaw())
				.putFloat("x", location.getX())
				.putFloat("y", location.getY())
				.putFloat("z", location.getZ())
				.putString("worldName", location.getWorld().getWorldName())
				.putInt("gamemode", data.getGameMode().ordinal())
				.build();
	}

	private PlayerData readPlayerData(NbtMap data) {
		var playerData = new PlayerData();
		playerData.setPitch(data.getFloat("pitch"));
		playerData.setYaw(data.getFloat("yaw"));
		playerData.setHeadYaw(data.getFloat("headYaw"));

		var position = Vector3f.from(data.getFloat("x"), data.getFloat("y"), data.getFloat("z"));
		var world = Server.getInstance().getWorldRegistry().getWorld(data.getString("worldName"));
		playerData.setLocation(Location.from(position, world));

		playerData.setGameMode(GameMode.values()[data.getInt("gamemode")]);

		return playerData;
	}
}

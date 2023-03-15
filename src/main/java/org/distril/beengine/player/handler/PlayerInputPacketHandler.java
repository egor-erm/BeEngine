package org.distril.beengine.player.handler;

import com.nukkitx.protocol.bedrock.handler.BedrockPacketHandler;
import com.nukkitx.protocol.bedrock.packet.*;
import lombok.extern.log4j.Log4j2;
import org.distril.beengine.player.Player;

@Log4j2
public class PlayerInputPacketHandler implements BedrockPacketHandler {

	private final Player player;

	public PlayerInputPacketHandler(Player player) {
		this.player = player;
	}

	@Override
	public boolean handle(PlayerAuthInputPacket packet) {
		if (!this.player.isSpawned()) {
			return true;
		}

		var to = packet.getPosition().sub(0, player.getEyeHeight(), 0);
		var from = player.getPosition();

		var pitch = packet.getRotation().getX() % 360;
		var yaw = packet.getRotation().getY() % 360;

		if (yaw < 0) {
			yaw += 360;
		}

		var distance = to.distanceSquared(from);

		if (distance == 0 && pitch == player.getPitch() && yaw == player.getYaw()) {
			return true;
		}

		if (distance > 100) {
			log.debug("{}: MovePlayerPacket too far REVERTING", player.getName());
			player.sendPosition(MovePlayerPacket.Mode.RESPAWN);
			return true;
		}

		player.setRotation(pitch, yaw);
		player.setPosition(to);

		// player.sendPosition(MovePlayerPacket.Mode.NORMAL);
		return true;
	}
}

package org.distril.beengine.world.chunk;

import com.google.common.base.Preconditions;
import com.nukkitx.network.VarInts;
import com.nukkitx.protocol.bedrock.packet.LevelChunkPacket;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.distril.beengine.entity.Entity;
import org.distril.beengine.material.Material;
import org.distril.beengine.material.block.Block;
import org.distril.beengine.material.block.BlockState;
import org.distril.beengine.player.Player;
import org.distril.beengine.server.Server;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Log4j2
@Getter
@RequiredArgsConstructor
public class Chunk {

	public static final int VERSION = 22;

	private static final BlockState AIR = Material.AIR.getBlock().getState();

	private final int x, z;
	private final SubChunk[] subChunks = new SubChunk[16];

	private final Set<Entity> entities = new HashSet<>();

	private final Set<ChunkLoader> loaders = new HashSet<>();

	private static void checkBounds(int x, int y, int z) {
		Preconditions.checkElementIndex(x, 16, "X coordinate");
		Preconditions.checkElementIndex(y, 256, "Y coordinate");
		Preconditions.checkElementIndex(z, 16, "Z coordinate");
	}

	public void setBlock(int x, int y, int z, int layer, Block block) {
		Chunk.checkBounds(x, y, z);

		var subChunk = this.getSubChunk(y >> 4);
		if (subChunk == null) {
			if (block.getMaterial() == Material.AIR) {
				return;
			}

			subChunk = this.getOrCreateSubChunk(y >> 4);
		}

		subChunk.setBlockState(x, y, z, layer, block.getState());
	}

	public Block getBlock(int x, int y, int z, int layer) {
		Chunk.checkBounds(x, y, z);

		var subChunk = this.getSubChunk(y >> 4);
		BlockState state;
		if (subChunk == null) {
			state = AIR;
		} else {
			state = subChunk.getBlockState(x, y, z, layer);
		}

		return Server.getInstance().getBlockRegistry().getBlockFromState(state);
	}

	public SubChunk getSubChunk(int index) {
		return this.subChunks[index];
	}

	public SubChunk getOrCreateSubChunk(int index) {
		for (int y = index; y >= 0; y--) {
			var subChunk = this.subChunks[y];
			if (subChunk == null) {
				subChunk = new SubChunk(y);
				this.subChunks[y] = subChunk;
			}
		}

		return this.subChunks[index];
	}

	public void addEntity(Entity entity) {
		this.entities.add(entity);
	}

	public void removeEntity(Entity entity) {
		this.entities.remove(entity);
	}

	public void addLoader(ChunkLoader loader) {
		if (loader != null) {
			this.loaders.add(loader);
		}
	}

	public void removeLoader(ChunkLoader loader) {
		if (loader != null) {
			this.loaders.remove(loader);
		}
	}

	public Set<ChunkLoader> getPlayersLoader() {
		return this.loaders.stream().filter(Player.class::isInstance).collect(Collectors.toSet());
	}

	public LevelChunkPacket createPacket() {
		var packet = new LevelChunkPacket();
		packet.setChunkX(this.x);
		packet.setChunkZ(this.z);
		packet.setSubChunksLength((int) Arrays.stream(this.subChunks).filter(Objects::nonNull).count());

		var buffer = Unpooled.buffer();
		try {
			for (SubChunk subChunk : this.subChunks) {
				if (subChunk == null) {
					break;
				}

				subChunk.writeToNetwork(buffer);
			}

			buffer.writeBytes(new byte[256]); // todo: biomes
			buffer.writeByte(0); // Border blocks size - Education Edition only

			VarInts.writeUnsignedInt(buffer, 0); // Extra Data length. Replaced by second block layer.

			byte[] data = new byte[buffer.readableBytes()];
			buffer.readBytes(data);

			packet.setData(data);
			return packet;
		} finally {
			buffer.release();
		}
	}

	public void close() {
		Arrays.fill(this.subChunks, null);

		this.entities.forEach(Entity::close);

		this.entities.clear();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Chunk that = (Chunk) obj;
		return this.x == that.getX() && this.z == that.getZ();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.z);
	}
}

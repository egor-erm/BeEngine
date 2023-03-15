package org.distril.beengine.player.handler;

import com.nukkitx.protocol.bedrock.handler.BedrockPacketHandler;
import com.nukkitx.protocol.bedrock.packet.*;
import lombok.extern.log4j.Log4j2;
import org.distril.beengine.player.Player;
import org.distril.beengine.server.Server;

@Log4j2
public class PlayerPacketHandler implements BedrockPacketHandler {

	private final Player player;

	private final InventoryPacketHandler inventoryPacketHandler;
	private final PlayerInputPacketHandler playerInputHandler;

	public PlayerPacketHandler(Player player) {
		this.player = player;
		this.inventoryPacketHandler = new InventoryPacketHandler(player);
		this.playerInputHandler = new PlayerInputPacketHandler(player);
	}

	@Override
	public boolean handle(CommandRequestPacket packet) {
		Server.getInstance().dispatchCommand(this.player, packet.getCommand().substring(1));
		return true;
	}

	@Override
	public boolean handle(InteractPacket packet) {
		if (packet.getAction() == InteractPacket.Action.OPEN_INVENTORY) {
			this.player.openInventory(this.player.getInventory());
		}

		return true;
	}

	@Override
	public boolean handle(PlayerAuthInputPacket packet) {
		return this.playerInputHandler.handle(packet);
	}

	@Override
	public boolean handle(RequestChunkRadiusPacket packet) {
		this.player.getChunkManager().setChunkRadius(packet.getRadius());
		return true;
	}

	@Override
	public boolean handle(ItemStackRequestPacket packet) {
		return this.inventoryPacketHandler.handle(packet);
	}

	@Override
	public boolean handle(InventoryTransactionPacket packet) {
		return this.inventoryPacketHandler.handle(packet);
	}

	@Override
	public boolean handle(MobEquipmentPacket packet) {
		return this.inventoryPacketHandler.handle(packet);
	}

	@Override
	public boolean handle(ContainerClosePacket packet) {
		return this.inventoryPacketHandler.handle(packet);
	}

	@Override
	public boolean handle(PacketViolationWarningPacket packet) {
		log.warn("Packet violation for {}: {}", packet.getPacketType(), packet.getContext());
		return true;
	}
}

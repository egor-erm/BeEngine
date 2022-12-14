package org.distril.beengine.inventory.defaults;

import com.nukkitx.math.vector.Vector3i;
import com.nukkitx.protocol.bedrock.data.inventory.ContainerId;
import com.nukkitx.protocol.bedrock.packet.ContainerOpenPacket;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.distril.beengine.inventory.InventoryType;
import org.distril.beengine.material.item.Item;
import org.distril.beengine.player.Player;

@Log4j2
@Getter
public class PlayerInventory extends EntityInventory {

	private final PlayerCursorInventory cursorInventory;

	public PlayerInventory(Player player) {
		super(player, InventoryType.PLAYER, ContainerId.INVENTORY);

		this.cursorInventory = new PlayerCursorInventory(player);
	}

	@Override
	public void clear() {
		super.clear();

		this.cursorInventory.clear();
	}

	public Item getCursorItem() {
		return this.cursorInventory.getCursorItem();
	}

	public void setCursorItem(Item item) {
		this.cursorInventory.setCursorItem(item);
	}

	@Override
	protected void onOpen(Player player) {
		var packet = new ContainerOpenPacket();
		packet.setId((byte) this.getId());
		packet.setType(this.getType().getContainerType());
		packet.setBlockPosition(Vector3i.ZERO);
		packet.setUniqueEntityId(player.getId());

		player.sendPacket(packet);

		this.sendSlots(player);
	}

	@Override
	public Player getHolder() {
		return (Player) super.getHolder();
	}
}

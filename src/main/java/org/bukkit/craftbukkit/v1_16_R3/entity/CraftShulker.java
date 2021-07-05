package org.bukkit.craftbukkit.v1_16_R3.entity;

import net.minecraft.entity.monster.ShulkerEntity;
import org.bukkit.DyeColor;
import org.bukkit.craftbukkit.v1_16_R3.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Shulker;

public class CraftShulker extends CraftGolem implements Shulker {

    public CraftShulker(CraftServer server, ShulkerEntity entity) {
        super(server, entity);
    }

    @Override
    public String toString() {
        return "CraftShulker";
    }

    @Override
    public EntityType getType() {
        return EntityType.SHULKER;
    }

    @Override
    public ShulkerEntity getHandle() {
        return (ShulkerEntity) entity;
    }

    @Override
    public DyeColor getColor() {
        return DyeColor.getByWoolData(getHandle().getEntityData().get(ShulkerEntity.DATA_COLOR_ID));
    }

    @Override
    public void setColor(DyeColor color) {
        getHandle().getEntityData().set(ShulkerEntity.DATA_COLOR_ID, (color == null) ? 16 : color.getWoolData());
    }
}

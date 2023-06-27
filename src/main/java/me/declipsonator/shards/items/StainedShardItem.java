package me.declipsonator.shards.items;

import net.minecraft.block.Stainable;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

public class StainedShardItem extends ShardItem implements Stainable {
    private final DyeColor color;

    public StainedShardItem(DyeColor color) {
        super(new Item.Settings());
        this.color = color;
    }

    @Override
    public DyeColor getColor() {
        return color;
    }
}

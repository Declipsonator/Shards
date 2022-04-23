package me.declipsonator.shards.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class StainedShardItem extends ShardItem {
    final DyeColor color;

    public StainedShardItem(DyeColor color) {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS));
        this.color = color;
    }

}

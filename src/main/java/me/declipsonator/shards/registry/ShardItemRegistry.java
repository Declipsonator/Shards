package me.declipsonator.shards.registry;

import me.declipsonator.shards.Shards;
import me.declipsonator.shards.items.ShardItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@EventBusSubscriber(modid = Shards.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ShardItemRegistry {

	@SubscribeEvent
	public static void registerItems(RegisterEvent e) {
		e.register(ForgeRegistries.Keys.ITEMS, helper -> {
			helper.register(new ResourceLocation(Shards.MODID, "glass_shard"), ShardItems.SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "white_stained_glass_shard"), ShardItems.WHITE_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "orange_stained_glass_shard"), ShardItems.ORANGE_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "magenta_stained_glass_shard"), ShardItems.MAGENTA_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "light_blue_stained_glass_shard"), ShardItems.LIGHT_BLUE_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "yellow_stained_glass_shard"), ShardItems.YELLOW_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "lime_stained_glass_shard"), ShardItems.LIME_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "pink_stained_glass_shard"), ShardItems.PINK_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "gray_stained_glass_shard"), ShardItems.GRAY_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "light_gray_stained_glass_shard"), ShardItems.LIGHT_GRAY_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "cyan_stained_glass_shard"), ShardItems.CYAN_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "purple_stained_glass_shard"), ShardItems.PURPLE_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "blue_stained_glass_shard"), ShardItems.BLUE_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "brown_stained_glass_shard"), ShardItems.BROWN_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "green_stained_glass_shard"), ShardItems.GREEN_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "red_stained_glass_shard"), ShardItems.RED_SHARD_ITEM);
			helper.register(new ResourceLocation(Shards.MODID, "black_stained_glass_shard"), ShardItems.BLACK_SHARD_ITEM);


        });
	}

}
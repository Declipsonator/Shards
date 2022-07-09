package me.declipsonator.shards;

import me.declipsonator.shards.items.ShardItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("shards")
public class Shards {
    public static final String MODID = "shards";
    private static final Logger LOG = LogManager.getLogger("Shards");

    public Shards() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOG.info("Initializing Shards");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOG.info("Initialized Shards");
    }

    // Change glass drops
    @SubscribeEvent
    public void onLootTables(LootTableLoadEvent event) {
        LootPoolSingletonContainer.Builder<?> builder = null;

        switch (event.getTable().getLootTableId().getPath()) {
            case "blocks/glass" -> builder = LootItem.lootTableItem(ShardItems.SHARD_ITEM);
            case "blocks/white_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.WHITE_SHARD_ITEM);
            case "blocks/orange_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.ORANGE_SHARD_ITEM);
            case "blocks/magenta_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.MAGENTA_SHARD_ITEM);
            case "blocks/light_blue_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.LIGHT_BLUE_SHARD_ITEM);
            case "blocks/yellow_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.YELLOW_SHARD_ITEM);
            case "blocks/lime_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.LIME_SHARD_ITEM);
            case "blocks/pink_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.PINK_SHARD_ITEM);
            case "blocks/gray_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.GRAY_SHARD_ITEM);
            case "blocks/light_gray_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.LIGHT_GRAY_SHARD_ITEM);
            case "blocks/cyan_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.CYAN_SHARD_ITEM);
            case "blocks/purple_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.PURPLE_SHARD_ITEM);
            case "blocks/blue_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.BLUE_SHARD_ITEM);
            case "blocks/brown_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.BROWN_SHARD_ITEM);
            case "blocks/green_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.GREEN_SHARD_ITEM);
            case "blocks/red_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.RED_SHARD_ITEM);
            case "blocks/black_stained_glass" -> builder = LootItem.lootTableItem(ShardItems.BLACK_SHARD_ITEM);
        }
        
        if (builder != null) {
            builder.when(MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1)))).invert());

            LootTable table = event.getTable();
            table.addPool(new LootPool.Builder()
                    .setRolls(UniformGenerator.between(2, 4))
                    .add(builder).build());
            event.setTable(table);
            return;
        }

        switch (event.getTable().getLootTableId().getPath()) {
            case "blocks/glass_pane" -> builder = LootItem.lootTableItem(ShardItems.SHARD_ITEM);
            case "blocks/white_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.WHITE_SHARD_ITEM);
            case "blocks/orange_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.ORANGE_SHARD_ITEM);
            case "blocks/magenta_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.MAGENTA_SHARD_ITEM);
            case "blocks/light_blue_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.LIGHT_BLUE_SHARD_ITEM);
            case "blocks/yellow_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.YELLOW_SHARD_ITEM);
            case "blocks/lime_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.LIME_SHARD_ITEM);
            case "blocks/pink_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.PINK_SHARD_ITEM);
            case "blocks/gray_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.GRAY_SHARD_ITEM);
            case "blocks/light_gray_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.LIGHT_GRAY_SHARD_ITEM);
            case "blocks/cyan_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.CYAN_SHARD_ITEM);
            case "blocks/purple_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.PURPLE_SHARD_ITEM);
            case "blocks/blue_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.BLUE_SHARD_ITEM);
            case "blocks/brown_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.BROWN_SHARD_ITEM);
            case "blocks/green_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.GREEN_SHARD_ITEM);
            case "blocks/red_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.RED_SHARD_ITEM);
            case "blocks/black_stained_glass_pane" -> builder = LootItem.lootTableItem(ShardItems.BLACK_SHARD_ITEM);
        }

        if (builder != null) {
            builder.when(MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1)))).invert());

            LootTable table = event.getTable();
            table.addPool(new LootPool.Builder()
                    .setRolls(ConstantValue.exactly(1))
                    .add(builder).build());
            event.setTable(table);
        }
    }


}

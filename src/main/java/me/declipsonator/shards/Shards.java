package me.declipsonator.shards;

import me.declipsonator.shards.items.ShardItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.*;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Shards implements ModInitializer {
    public static final Logger LOG = LogManager.getLogger("Shards");


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("shards", "glass_shard"), ShardItems.SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "white_stained_glass_shard"), ShardItems.WHITE_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "orange_stained_glass_shard"), ShardItems.ORANGE_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "magenta_stained_glass_shard"), ShardItems.MAGENTA_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "light_blue_stained_glass_shard"), ShardItems.LIGHT_BLUE_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "yellow_stained_glass_shard"), ShardItems.YELLOW_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "lime_stained_glass_shard"), ShardItems.LIME_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "pink_stained_glass_shard"), ShardItems.PINK_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "gray_stained_glass_shard"), ShardItems.GRAY_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "light_gray_stained_glass_shard"), ShardItems.LIGHT_GRAY_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "cyan_stained_glass_shard"), ShardItems.CYAN_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "purple_stained_glass_shard"), ShardItems.PURPLE_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "blue_stained_glass_shard"), ShardItems.BLUE_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "brown_stained_glass_shard"), ShardItems.BROWN_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "green_stained_glass_shard"), ShardItems.GREEN_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "red_stained_glass_shard"), ShardItems.RED_SHARD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("shards", "black_stained_glass_shard"), ShardItems.BLACK_SHARD_ITEM);
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .withCondition(MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1)))).invert().build());

            boolean added = false;
            switch (id.getPath()) {
                case "blocks/glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.SHARD_ITEM));
                    added = true;
                }
                case "blocks/white_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.WHITE_SHARD_ITEM));
                    added = true;
                }
                case "blocks/orange_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.ORANGE_SHARD_ITEM));
                    added = true;
                }
                case "blocks/magenta_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.MAGENTA_SHARD_ITEM));
                    added = true;
                }
                case "blocks/light_blue_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_BLUE_SHARD_ITEM));
                    added = true;
                }
                case "blocks/yellow_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.YELLOW_SHARD_ITEM));
                    added = true;
                }
                case "blocks/lime_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.LIME_SHARD_ITEM));
                    added = true;
                }
                case "blocks/pink_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.PINK_SHARD_ITEM));
                    added = true;
                }
                case "blocks/gray_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.GRAY_SHARD_ITEM));
                    added = true;
                }
                case "blocks/light_gray_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_GRAY_SHARD_ITEM));
                    added = true;
                }
                case "blocks/cyan_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.CYAN_SHARD_ITEM));
                    added = true;
                }
                case "blocks/purple_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.PURPLE_SHARD_ITEM));
                    added = true;
                }
                case "blocks/blue_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.BLUE_SHARD_ITEM));
                    added = true;
                }
                case "blocks/brown_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.BROWN_SHARD_ITEM));
                    added = true;
                }
                case "blocks/green_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.GREEN_SHARD_ITEM));
                    added = true;
                }
                case "blocks/red_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.RED_SHARD_ITEM));
                    added = true;
                }
                case "blocks/black_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.BLACK_SHARD_ITEM));
                    added = true;
                }
            }
            if(added) table.pool(poolBuilder.rolls(UniformLootNumberProvider.create(2, 4)));
            else {
                switch (id.getPath()) {
                    case "blocks/glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/white_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.WHITE_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/orange_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.ORANGE_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/magenta_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.MAGENTA_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/light_blue_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_BLUE_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/yellow_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.YELLOW_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/lime_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.LIME_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/pink_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.PINK_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/gray_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.GRAY_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/light_gray_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_GRAY_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/cyan_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.CYAN_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/purple_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.PURPLE_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/blue_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.BLUE_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/brown_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.BROWN_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/green_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.GREEN_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/red_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.RED_SHARD_ITEM));
                        added = true;
                    }
                    case "blocks/black_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.BLACK_SHARD_ITEM));
                        added = true;
                    }
                }
                if(added) table.pool(poolBuilder.rolls(ConstantLootNumberProvider.create(1)));
            }
        });


        LOG.info("Shards has been initialized!");
    }
}

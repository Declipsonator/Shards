package me.declipsonator.shards;

import me.declipsonator.shards.items.ShardItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemGroups;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.predicate.item.ItemSubPredicateTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;


public class Shards implements ModInitializer {
    public static final Logger LOG = LogManager.getLogger("Shards");


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("shards", "glass_shard"), ShardItems.SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "white_stained_glass_shard"), ShardItems.WHITE_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "orange_stained_glass_shard"), ShardItems.ORANGE_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "magenta_stained_glass_shard"), ShardItems.MAGENTA_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "light_blue_stained_glass_shard"), ShardItems.LIGHT_BLUE_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "yellow_stained_glass_shard"), ShardItems.YELLOW_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "lime_stained_glass_shard"), ShardItems.LIME_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "pink_stained_glass_shard"), ShardItems.PINK_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "gray_stained_glass_shard"), ShardItems.GRAY_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "light_gray_stained_glass_shard"), ShardItems.LIGHT_GRAY_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "cyan_stained_glass_shard"), ShardItems.CYAN_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "purple_stained_glass_shard"), ShardItems.PURPLE_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "blue_stained_glass_shard"), ShardItems.BLUE_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "brown_stained_glass_shard"), ShardItems.BROWN_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "green_stained_glass_shard"), ShardItems.GREEN_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "red_stained_glass_shard"), ShardItems.RED_SHARD_ITEM);
        Registry.register(Registries.ITEM, new Identifier("shards", "black_stained_glass_shard"), ShardItems.BLACK_SHARD_ITEM);
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .conditionally(MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().subPredicate(ItemSubPredicateTypes.ENCHANTMENTS,
                                    EnchantmentsPredicate.enchantments(
                                            Collections.singletonList(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1)))))).invert().build());
            boolean added = false;
            switch (key.getValue().toString()) {
                case "minecraft:blocks/glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/white_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.WHITE_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/orange_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.ORANGE_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/magenta_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.MAGENTA_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/light_blue_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_BLUE_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/yellow_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.YELLOW_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/lime_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.LIME_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/pink_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.PINK_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/gray_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.GRAY_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/light_gray_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_GRAY_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/cyan_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.CYAN_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/purple_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.PURPLE_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/blue_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.BLUE_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/brown_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.BROWN_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/green_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.GREEN_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/red_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.RED_SHARD_ITEM));
                    added = true;
                }
                case "minecraft:blocks/black_stained_glass" -> {
                    poolBuilder.with(ItemEntry.builder(ShardItems.BLACK_SHARD_ITEM));
                    added = true;
                }
            }
            if(added) tableBuilder.pool(poolBuilder.rolls(UniformLootNumberProvider.create(2, 4)));
            else {
                switch (key.toString()) {
                    case "minecraft:blocks/glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/white_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.WHITE_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/orange_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.ORANGE_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/magenta_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.MAGENTA_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/light_blue_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_BLUE_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/yellow_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.YELLOW_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/lime_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.LIME_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/pink_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.PINK_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/gray_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.GRAY_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/light_gray_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.LIGHT_GRAY_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/cyan_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.CYAN_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/purple_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.PURPLE_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/blue_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.BLUE_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/brown_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.BROWN_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/green_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.GREEN_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/red_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.RED_SHARD_ITEM));
                        added = true;
                    }
                    case "minecraft:blocks/black_stained_glass_pane" -> {
                        poolBuilder.with(ItemEntry.builder(ShardItems.BLACK_SHARD_ITEM));
                        added = true;
                    }
                }
                if(added) tableBuilder.pool(poolBuilder.rolls(ConstantLootNumberProvider.create(1)));
            }
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(ShardItems.SHARD_ITEM);
            content.add(ShardItems.BLACK_SHARD_ITEM);
            content.add(ShardItems.BLUE_SHARD_ITEM);
            content.add(ShardItems.BROWN_SHARD_ITEM);
            content.add(ShardItems.CYAN_SHARD_ITEM);
            content.add(ShardItems.GRAY_SHARD_ITEM);
            content.add(ShardItems.GREEN_SHARD_ITEM);
            content.add(ShardItems.LIGHT_BLUE_SHARD_ITEM);
            content.add(ShardItems.LIGHT_GRAY_SHARD_ITEM);
            content.add(ShardItems.LIME_SHARD_ITEM);
            content.add(ShardItems.MAGENTA_SHARD_ITEM);
            content.add(ShardItems.ORANGE_SHARD_ITEM);
            content.add(ShardItems.PINK_SHARD_ITEM);
            content.add(ShardItems.PURPLE_SHARD_ITEM);
            content.add(ShardItems.RED_SHARD_ITEM);
            content.add(ShardItems.WHITE_SHARD_ITEM);
            content.add(ShardItems.YELLOW_SHARD_ITEM);
        });

        LOG.info("Shards has been initialized!");
    }
}

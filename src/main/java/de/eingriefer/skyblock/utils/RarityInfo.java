package de.eingriefer.skyblock.utils;

import com.avaje.ebeaninternal.server.type.reflect.ReflectionBasedCompoundType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.material.Door;
import org.bukkit.material.Pumpkin;
import org.bukkit.material.Stairs;

public class RarityInfo {

    public static RarityLevel getRarity(Material material) {
        switch (material) {
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_STAIRS:
            case ACTIVATOR_RAIL:
            case ANVIL:
            case ARROW:
            case BANNER:
            case BED:
            case RAW_BEEF:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_WOOD_STAIRS:
            case BOAT:
            case BONE:
            case BOOK:
            case BOW:
            case BOWL:
            case BREAD:
            case BRICK:
            case BRICK_STAIRS:
            case BUCKET:
            case CACTUS:
            case CAKE:
            case CARPET:
            case CARROT:
            case CARROT_STICK:
            case CAULDRON:
            case CAULDRON_ITEM:
            case CHEST:
            case STORAGE_MINECART:
            case RAW_CHICKEN:
            case COOKED_CHICKEN:
            case CLAY:
            case COAL:
            case COAL_ORE:
            case COAL_BLOCK:
            case COBBLESTONE:
            case COBBLESTONE_STAIRS:
            case MOSSY_COBBLESTONE:
            case REDSTONE_COMPARATOR:
            case COMPASS:
            case COOKED_BEEF:
            case COOKED_FISH:
            case COOKED_MUTTON:
            case COOKED_RABBIT:
            case WORKBENCH:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_STAIRS:
            case DARK_OAK_DOOR_ITEM:
            case DARK_OAK_FENCE_GATE:
            case DEAD_BUSH:
            case DETECTOR_RAIL:
            case DIRT:
            case DISPENSER:
            case DOUBLE_PLANT:
            case DROPPER:
            case ENDER_PEARL:
            case EXP_BOTTLE:
            case FEATHER:
            case FENCE:
            case FENCE_GATE:
            case MAP:
            case RAW_FISH:
            case FISHING_ROD:
            case FLINT:
            case FLINT_AND_STEEL:
            case FLOWER_POT:
            case FURNACE:
            case MINECART:
            case HOPPER_MINECART:
            case POWERED_MINECART:
            case EXPLOSIVE_MINECART:
            case GHAST_TEAR:
            case GLASS:
            case GLASS_BOTTLE:
            case STAINED_GLASS_PANE:
            case THIN_GLASS:
            case GOLD_INGOT:
            case STAINED_GLASS:
            case GOLD_NUGGET:
            case GOLD_AXE:
            case GOLD_HOE:
            case GOLD_BOOTS:
            case GOLD_PLATE:
            case GOLD_SPADE:
            case GOLD_SWORD:
            case GOLD_HELMET:
            case GOLD_RECORD:
            case GOLD_BARDING:
            case GOLD_PICKAXE:
            case GOLD_LEGGINGS:
            case GOLDEN_CARROT:
            case GOLD_CHESTPLATE:
            case POWERED_RAIL:
            case GRAVEL:
            case HARD_CLAY:
            case HAY_BLOCK:
            case HOPPER:
            case COMMAND_MINECART:
            case ICE:
            case IRON_AXE:
            case IRON_BARDING:
            case IRON_HOE:
            case IRON_DOOR:
            case IRON_BOOTS:
            case IRON_FENCE:
            case IRON_INGOT:
            case IRON_PLATE:
            case IRON_SPADE:
            case IRON_SWORD:
            case IRON_HELMET:
            case IRON_PICKAXE:
            case IRON_LEGGINGS:
            case IRON_TRAPDOOR:
            case IRON_CHESTPLATE:
            case IRON_DOOR_BLOCK:
            case ITEM_FRAME:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_DOOR_ITEM:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_WOOD_STAIRS:
            case LADDER:
            case LAVA_BUCKET:
            case LEATHER:
            case LEATHER_BOOTS:
            case LEATHER_HELMET:
            case LEATHER_LEGGINGS:
            case LEATHER_CHESTPLATE:
            case LEVER:
            case PUMPKIN:
            case PUMPKIN_PIE:
            case PUMPKIN_STEM:
            case PUMPKIN_SEEDS:
            case LOG:
            case LOG_2:
            case MELON:
            case MELON_STEM:
            case MELON_BLOCK:
            case MELON_SEEDS:
            case COBBLE_WALL:
            case MUTTON:
            case NAME_TAG:
            case NETHER_BRICK:
            case NETHER_BRICK_ITEM:
            case NETHER_BRICK_STAIRS:
            case NETHERRACK:
            case WOOD_STAIRS:
            case QUARTZ_STAIRS:
            case SMOOTH_STAIRS:
            case SANDSTONE_STAIRS:
            case SPRUCE_WOOD_STAIRS:
            case RED_SANDSTONE_STAIRS:
            case PACKED_ICE:
            case PISTON_BASE:
            case PISTON_EXTENSION:
            case PISTON_STICKY_BASE:
            case PISTON_MOVING_PIECE:
            case POTATO:
            case PRISMARINE_CRYSTALS:
            case POTATO_ITEM:
            case RABBIT:
            case RABBIT_FOOT:
            case RABBIT_HIDE:
            case RABBIT_STEW:
            case RAILS:
            case RED_ROSE:
            case FLOWER_POT_ITEM:
            case SANDSTONE:
            case REDSTONE:
            case REDSTONE_WIRE:
            case REDSTONE_LAMP_ON:
            case REDSTONE_TORCH_ON:
            case REDSTONE_LAMP_OFF:
            case REDSTONE_TORCH_OFF:
            case REDSTONE_COMPARATOR_ON:
            case REDSTONE_COMPARATOR_OFF:
            case GLOWING_REDSTONE_ORE:
            case SUGAR:
            case SUGAR_CANE:
            case SUGAR_CANE_BLOCK:
            case ROTTEN_FLESH:
            case SADDLE:
            case SAND:
            case SHEARS:
            case SIGN:
            case SLIME_BALL:
            case SLIME_BLOCK:
            case SKULL:
            case SOUL_SAND:
            case SAPLING:
            case SNOW:
            case SNOW_BALL:
            case SNOW_BLOCK:
            case SPONGE:
            case SPIDER_EYE:
            case TRAP_DOOR:
            case WOOD_DOOR:
            case SPRUCE_DOOR:
            case WOODEN_DOOR:
            case BIRCH_DOOR_ITEM:
            case ACACIA_DOOR_ITEM:
            case SPRUCE_DOOR_ITEM:
            case STAINED_CLAY:
            case PRISMARINE_SHARD:
            case STICK:
            case STONE:
            case STONE_AXE:
            case STONE_HOE:
            case STONE_PLATE:
            case STONE_SLAB2:
            case STONE_SPADE:
            case STONE_SWORD:
            case STONE_BUTTON:
            case STONE_PICKAXE:
            case GLOWSTONE_DUST:
            case DOUBLE_STONE_SLAB2:
            case STRING:
            case LONG_GRASS:
            case TRIPWIRE:
            case TRIPWIRE_HOOK:
            case VINE:
            case WATER_BUCKET:
            case WATER:
            case WATER_LILY:
            case WHEAT:
            case SEEDS:
            case WOOD:
            case WOOD_AXE:
            case WOOD_HOE:
            case WOOD_STEP:
            case WOOD_PLATE:
            case WOOD_SPADE:
            case WOOD_SWORD:
            case WOOD_BUTTON:
            case WOOD_PICKAXE:
            case WOOD_DOUBLE_STEP:
            case WOOL:
            case YELLOW_FLOWER:
                Bukkit.getLogger().info("common-rarity item picked up");
                return RarityLevel.COMMON;
            case APPLE:
            case PRISMARINE:
            case REDSTONE_BLOCK:
            case PAINTING:
            case BOOK_AND_QUILL:
            case WRITTEN_BOOK:
            case SEA_LANTERN:
            case ARMOR_STAND:
            case TNT:
            case SPECKLED_MELON:
            case BAKED_POTATO:
            case RED_MUSHROOM:
            case REDSTONE_ORE:
            case RED_SANDSTONE:
            case QUARTZ:
            case QUARTZ_ORE:
            case QUARTZ_BLOCK:
            case BLAZE_ROD:
            case MUSHROOM_SOUP:
            case LAPIS_ORE:
            case MYCEL:
            case MAGMA_CREAM:
            case LAPIS_BLOCK:
            case POISONOUS_POTATO:
            case GRASS:
            case OBSIDIAN:
            case BLAZE_POWDER:
            case MILK_BUCKET:
            case NOTE_BLOCK:
            case IRON_BLOCK:
            case JUKEBOX:
            case GLOWSTONE:
            case IRON_ORE:
            case BOOKSHELF:
            case GOLDEN_APPLE:
            case BREWING_STAND:
            case BREWING_STAND_ITEM:
            case BROWN_MUSHROOM:
            case COOKIE:
            case DAYLIGHT_DETECTOR:
            case DIAMOND:
            case DIAMOND_AXE:
            case WEB:
            case DIAMOND_HOE:
            case DIAMOND_ORE:
            case DIAMOND_BLOCK:
            case DIAMOND_BOOTS:
            case DIAMOND_SPADE:
            case DIAMOND_SWORD:
            case DIAMOND_HELMET:
            case DIAMOND_BARDING:
            case DIAMOND_PICKAXE:
            case DIAMOND_LEGGINGS:
            case GOLD_ORE:
            case DIAMOND_CHESTPLATE:
            case EGG:
            case EMERALD:
            case EMERALD_ORE:
            case EMERALD_BLOCK:
            case ENCHANTED_BOOK:
            case ENCHANTMENT_TABLE:
            case ENDER_CHEST:
            case EYE_OF_ENDER:
            case FERMENTED_SPIDER_EYE:
            case GOLD_BLOCK:
            case LEAVES:
            case LEAVES_2:
                Bukkit.getLogger().info("usual-rarity item picked up");
                return RarityLevel.USUAL;
            case BEACON:
            case SKULL_ITEM:
            case POTION:
            case CHAINMAIL_BOOTS:
            case CHAINMAIL_HELMET:
            case CHAINMAIL_LEGGINGS:
            case CHAINMAIL_CHESTPLATE:
            case FIREBALL:
            case FIREWORK:
            case NETHER_STAR:
            case NETHER_STALK:
            case FIREWORK_CHARGE:
            case FIRE:
            case MONSTER_EGG:
            case MONSTER_EGGS:
            case RECORD_3:
            case RECORD_4:
            case RECORD_5:
            case RECORD_6:
            case RECORD_7:
            case RECORD_8:
            case RECORD_9:
            case RECORD_10:
            case RECORD_11:
            case RECORD_12:
                Bukkit.getLogger().info("epic-rarity item picked up");
                return RarityLevel.EPIC;
            case BARRIER:
            case BEDROCK:
            case DRAGON_EGG:
            case ENDER_PORTAL:
            case ENDER_STONE:
            case ENDER_PORTAL_FRAME:
            case MOB_SPAWNER:
                Bukkit.getLogger().info("legendary-rarity item picked up");
                return RarityLevel.LEGENDARY;
            default:
                Bukkit.getLogger().info("unknown-rarity item picked up");
                return RarityLevel.UNKNOWN;
        }
    }

}

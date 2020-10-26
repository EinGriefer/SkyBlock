package de.eingriefer.skyblock.utils;

import org.bukkit.Material;

public enum CustomItem {

    LEGENDARY_SWORD("§b§lLEGENDÄRES SCHWERT", "§7Dieses Schwert ist legendär!", Material.DIAMOND_SWORD, RarityLevel.LEGENDARY);

    private String name;
    private String description;
    private Material material;
    private RarityLevel rarityLevel;

    CustomItem(String name, String description, Material material, RarityLevel rarity) {
        this.name = name;
        this.description = description;
        this.material = material;
        this.rarityLevel = rarity;
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public RarityLevel getRarityLevel() {
        return rarityLevel;
    }

}

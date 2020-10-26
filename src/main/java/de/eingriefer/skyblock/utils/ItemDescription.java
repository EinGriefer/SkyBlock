package de.eingriefer.skyblock.utils;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class ItemDescription {

    public static List<String> getDescription(Material material) {
        RarityLevel rarityLevel = RarityInfo.getRarity(material);
        List<String> l = new ArrayList<String>();
        l.add(" ");
        l.add(rarityLevel.getVisual());
        return l;
    }

    public static List<String> getDescription(CustomItem customItem) {
        List<String> l = new ArrayList<String>();
        l.add(" ");
        l.add(customItem.getDescription());
        l.add(" ");
        l.add(customItem.getRarityLevel().getVisual());
        return l;
    }

}

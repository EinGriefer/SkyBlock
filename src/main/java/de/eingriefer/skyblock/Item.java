package de.eingriefer.skyblock;

import de.eingriefer.skyblock.utils.ItemType;
import de.eingriefer.skyblock.utils.RarityLevel;
import javafx.scene.paint.Material;

public class Item {

    public Material material;
    public RarityLevel rarityLevel;
    public ItemType type;

    public Item(Material material, RarityLevel rarityLevel) {
        this.material = material;
        this.rarityLevel = rarityLevel;
        this.type = ItemType.CUSTOM;
    }

}

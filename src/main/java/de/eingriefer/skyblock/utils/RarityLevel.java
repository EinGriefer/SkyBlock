package de.eingriefer.skyblock.utils;

public enum RarityLevel{
    UNKNOWN("§7§lUNBEKANNT"),
    COMMON("§e§lNORMAL"),
    USUAL("§6§lÜBLICH"),
    EPIC("§5§lEPISCH"),
    LEGENDARY("§d§lLEGENDÄR");

    private String visual;

    RarityLevel(String visual) {
        this.visual = visual;
    }

    public String getVisual() {
        return this.visual;
    }
}

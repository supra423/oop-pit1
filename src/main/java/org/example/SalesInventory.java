package org.example;

public class SalesInventory {
    private static final BoughtItem[] boughtItems = new BoughtItem[Inventory.getInventory().length];
    static {
        for (int i = 0; i < boughtItems.length; i++) {
            boughtItems[i] = new BoughtItem(Inventory.getInventory()[i]);
        }
    }
    public static BoughtItem[] getBoughtItems() {
        return boughtItems;
    }
}
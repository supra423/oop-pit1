package org.example;

import java.util.ArrayList;

public class SalesInventory {
    private static final ArrayList<BoughtItem> salesInventory = new ArrayList<>();
    public static ArrayList<BoughtItem> getSalesInventory() { return salesInventory; }
    public static void appendSalesInventory(BoughtItem boughtItem) { salesInventory.add(boughtItem); }
}
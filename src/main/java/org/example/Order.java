package org.example;

import java.util.ArrayList;

public class Order {
    private static ArrayList<BoughtItem> orders = new ArrayList<>();
    private double totalCost;

    public static ArrayList<BoughtItem> getOrders() {
        return orders;
    }
    public static void appendOrders(BoughtItem boughtItem) {
        orders.add(boughtItem);
    }
}
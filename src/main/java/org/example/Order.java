package org.example;

import java.util.ArrayList;

public class Order {
    private static final ArrayList<BoughtItem> orders = new ArrayList<>();

    public static ArrayList<BoughtItem> getOrders() {
        return orders;
    }
    public static void appendOrders(BoughtItem boughtItem) {
        orders.add(boughtItem);
    }
    public static double calculateTotal() {
        double totalCost = 0;
        for (BoughtItem boughtItem : orders) {
            totalCost += boughtItem.getQuantity() * boughtItem.getProduct().price();
        }
        return totalCost;
    }
    public static void resetOrders() { orders.clear(); }
}
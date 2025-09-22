package org.example;

import java.util.ArrayList;

public class OrderHistory {
    private ArrayList<Order> orderHistory = new ArrayList<>();

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
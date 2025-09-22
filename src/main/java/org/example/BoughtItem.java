package org.example;

public class BoughtItem {
    private final Product product;
    private int quantity;
    public BoughtItem(Product product) {
        this.product = product;
        this.quantity = 0;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}

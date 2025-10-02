package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Inventory {
    private static final Product[] inventory;
    static ProductData[] productData = {
        new ProductData("iPhoon X White", 99.99, "/assets/ip10-white.png", 130, 130),
        new ProductData("iPhoon XI Green", 199.99, "/assets/ip11-green.png", 130, 130),
        new ProductData("iPhoon XIII Pink", 299.99, "/assets/ip13-pink.png", 170, 170),
        new ProductData("iPhoon XIV Blue", 399.99, "/assets/ip14-blue.png", 180, 180),
        new ProductData("iPhoon XV Blue", 499.99, "/assets/ip15-blue.png", 150, 150),
        new ProductData("iPhoon XVI Pink", 599.99, "/assets/ip16-pink.png", 170, 170),
        new ProductData("iPhoon XVII Orange", 699.99, "/assets/ip17-orange.png", 150, 150),
        new ProductData("iPhoon XII Mini Blue", 799.99, "/assets/ip-12-mini-blue.png", 150, 150)
    }; // this is used to store full information of the product to use in the for loop
    static {
        inventory = new Product[productData.length];
        for (int i = 0; i < productData.length; i++) {
            ImageIcon imageIcon = new ImageIcon(
                    Objects.requireNonNull(Inventory.class.getResource(productData[i].path()))
            );

            Image scaledImage = imageIcon.getImage().getScaledInstance(productData[i].width(), productData[i].height(), Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(scaledImage);

            inventory[i] = new Product(productData[i].name(), productData[i].price(), newIcon);
        }
    }
    public Product[] getInventory() { return inventory; }
}
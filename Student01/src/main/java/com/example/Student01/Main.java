package com.example.Student01;

import java.util.ArrayList;

/** Simple standalone product-list demonstration retained from the starter project. */
class ProductDetails {
    int productId;
    String productName;
    double price;

    ProductDetails(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println(productId + " " + productName + " " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        ProductDetails p1 = new ProductDetails(1, "Soap", 100);
        ProductDetails p2 = new ProductDetails(2, "Gel", 300);
        ProductDetails p3 = new ProductDetails(3, "Shampoo", 400);

        ArrayList<ProductDetails> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        System.out.println("All Products:");
        for (ProductDetails product : products) {
            product.display();
        }

        products.remove(p2);
        System.out.println("\nAfter removing one product:");
        for (ProductDetails product : products) {
            product.display();
        }
    }
}


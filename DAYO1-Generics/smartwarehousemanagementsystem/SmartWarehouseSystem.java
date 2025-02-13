/*
Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).

*/

package com.smartwarehousemanagementsystem;

// Generic Storage class
import java.util.ArrayList;
import java.util.List;

// Abstract class representing a warehouse item
abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to display the details of the item.
    public abstract void display();
}

// Concrete warehouse item types
class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Electronics Item: " + getName() + " | Price: $" + getPrice());
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Grocery Item: " + getName() + " | Price: $" + getPrice());
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Furniture Item: " + getName() + " | Price: $" + getPrice());
    }
}

// Generic Storage class to hold different item types
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Utility class to display items in storage
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display(); // Calling the display() method of each item
        }
    }
}

// Main class to test the Smart Warehouse Management System
public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to storage
        electronicsStorage.addItem(new Electronics("Laptop", 1500.0));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.0));

        groceriesStorage.addItem(new Groceries("Apple", 2.0));
        groceriesStorage.addItem(new Groceries("Milk", 3.5));

        furnitureStorage.addItem(new Furniture("Chair", 100.0));
        furnitureStorage.addItem(new Furniture("Table", 250.0));

        // Display items
        System.out.println("Electronics Storage:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}

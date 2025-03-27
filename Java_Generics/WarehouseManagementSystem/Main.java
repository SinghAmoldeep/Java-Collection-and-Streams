package Java_Generics.WarehouseManagementSystem;

import Java_Generics.WarehouseManagementSystem.warehouse_items.*;

public class Main {
    public static void main(String[] args) {  // main function
        Electronics electronics = new Electronics(1, "TV");
        Electronics electronics2 = new Electronics(2, "Remote");
        Groceries groceries = new Groceries(2, "Milk");
        Groceries groceries2 = new Groceries(3, "Vegetables");
        Furniture furniture = new Furniture(3, "Table");
        Furniture furniture2 = new Furniture(4, "Chair");


        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(electronics);
        electronicsStorage.addItem(electronics2);
        groceriesStorage.addItem(groceries);
        groceriesStorage.addItem(groceries2);
        furnitureStorage.addItem(furniture);
        furnitureStorage.addItem(furniture2);


        Storage.displayStorageItems(electronicsStorage.getItems());
    }
}
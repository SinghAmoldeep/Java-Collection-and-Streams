package Java_Generics.WarehouseManagementSystem;

import Java_Generics.WarehouseManagementSystem.warehouse_items.WarehouseItems;

import java.util.ArrayList;

public class Storage<T extends WarehouseItems> {  // Storage
    private final ArrayList<T>items;

    public Storage(){
        items=new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }
    public void addItem(T item){
        items.add(item);
    }

    public static void displayStorageItems(ArrayList<? extends WarehouseItems> items) {
        for (WarehouseItems item : items) {
            System.out.println(item);
        }
    }
}
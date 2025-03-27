
package Java_Generics.WarehouseManagementSystem.warehouse_items;

public abstract class WarehouseItems {   // defining all items (super class)
    private int id;
    private String name;

    public WarehouseItems(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WarehouseItem{" + "id=" + id + ", name=" + name + '}';
    }
}

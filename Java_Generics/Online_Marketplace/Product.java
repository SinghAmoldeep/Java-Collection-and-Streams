package Java_Generics.Online_Marketplace;

import Java_Generics.Online_Marketplace.product_categories.Catetories;

public class Product<T extends Catetories> {  // defining different product categories
    private String name;
    public T category;

    public Product(String name ,T category){
        this.name=name;
        this.category=category;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getCategory() {
        return category;
    }

    public void setCategory(T category) {
        this.category = category;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        System.out.println("Discount applied for " + product.getName() + " with percentage " + percentage);
    }
}
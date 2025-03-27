package Java_Generics.Online_Marketplace.product_categories;

public class Books implements Catetories {  // Implementing categories
    private String name;

    public Books(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
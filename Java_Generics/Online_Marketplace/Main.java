package Java_Generics.Online_Marketplace;

import Java_Generics.Online_Marketplace.product_categories.*;

public class Main {
    public static void main(String[] args) { // main function
        ProductCatalog catalog = new ProductCatalog();

        Product<Books> book = new Product<>("Java Programming", new Books("Educational"));
        Product<Clothes> shirt = new Product<>("Designer Shirt", new Clothes("Casual"));

        catalog.addProduct(book);
        catalog.addProduct(shirt);

        catalog.displayCatalog();

        Product.applyDiscount(book, 10);
    }
}
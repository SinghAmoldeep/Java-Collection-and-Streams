package Java_Generics.Online_Marketplace;

import Java_Generics.Online_Marketplace.product_categories.Catetories;

import java.util.ArrayList;

public class ProductCatalog {  // ProDUCT Catalog
    private final ArrayList<Product<? extends Catetories>>products;
    public ProductCatalog(){
        products=new ArrayList<>();
    }
    public void addProduct(Product<? extends Catetories> product){
        products.add(product);
    }
    public void displayCatalog(){
        for(Product<?> product :products){
            System.out.println(product);
        }
    }
}
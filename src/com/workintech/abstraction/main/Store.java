package com.workintech.abstraction.main;

import com.workintech.abstraction.model.Bread;
import com.workintech.abstraction.model.Chocolate;
import com.workintech.abstraction.model.Coke;
import com.workintech.abstraction.model.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet", 15, "Yazılımcı dostu",
                "black", true);
        products[1]=new Bread("Bakery",12,"taze ekmek","tam buğday");
        products[2]=new Coke("Drinks",20,"Soğuk içiniz",true);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }

    }
}
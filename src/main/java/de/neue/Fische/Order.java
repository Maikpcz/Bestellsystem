package de.neue.Fische;

import java.util.HashMap;
import java.util.List;


public class Order {
    private String id;
    private HashMap<String,Product> produts;


    public Order() {
    }

    public Order(String id, HashMap<String, Product> produts) {
        this.id = id;
        this.produts = produts;
    }

    public Order(String i, List<Product> produt1, Product product2) {
    }

    public Order(String i, Product produt1, Product product2, Product product3) {
    }

    public Order(HashMap<String, Product> produts) {
        this.produts = produts;
    }
}

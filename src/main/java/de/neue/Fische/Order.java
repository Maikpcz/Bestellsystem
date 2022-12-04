package de.neue.Fische;

import java.util.HashMap;
import java.util.List;


public class Order {
    private Integer id;
    private HashMap<Integer,Product> produts;


    public Order() {
    }


    public Order(String i, List<Product> produt1, Product product2) {
    }

    public Order(String i, Product produt1, Product product2, Product product3) {
    }

    public Order(HashMap<Integer, Product> produts) {
        this.produts = produts;
    }

    public Order(int id, Product product) {

    }

    public Order(Product product1) {

    }


    public Order(int i, HashMap<Integer, Product> produt) {
    }



    public Order(Integer id, HashMap<String, Product> newProduct) {


    }
}

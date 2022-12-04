package de.neue.Fische;

import java.util.HashMap;

public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {
    }

    public Product(int id, HashMap<String, Product> produt) {

    }


    public int getId() {
        return id;
    }

    public Integer setId(int id) {
        this.id = id;
        return null;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

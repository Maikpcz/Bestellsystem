package de.neue.Fische;

import java.util.HashMap;


public class ProductRepo {

    public HashMap<Integer,Product> productList;



    //Abfrage der Productliste
    public HashMap<Integer,Product> listProducts() {
        return productList;
    }


    //Suche Product mit Bestimmter Id und lasse die Austragen.
    // Wenn nicht vorhanden dann Exception
      public Product get(Integer id) {
        if(productList.containsKey(id)){
            return productList.get(id);}
          throw new IllegalArgumentException("Product is not available");}

    public ProductRepo(HashMap<Integer, Product> productList) {
        this.productList = productList;
    }

    public HashMap<Integer, Product> getProductList() {
        return productList;
    }

    public void setProductList(HashMap<Integer, Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }
}
//constructor

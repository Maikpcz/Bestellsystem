package de.neue.Fische;

import java.util.HashMap;


public class ProductRepo {

    //Meine RepoListe
    public HashMap<String,Product> productList;



    //Abfrage der Productliste
    public HashMap<String,Product> list() {
        return productList;
    }


    //Suche Product mit Bestimmter Id und lasse die Austragen.
    // Wenn nicht vorhanden dann Exception
      public HashMap<String, Product> get(String id) {
        if(productList.containsKey(id)) System.out.println(productList.get(id));
        else throw new IllegalArgumentException("Product is not available");
      return get(id);
    }
//constructor
    public ProductRepo(HashMap<String, Product> productList) {
        this.productList = productList;
    }
}
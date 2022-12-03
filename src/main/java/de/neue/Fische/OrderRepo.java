package de.neue.Fische;

import java.util.HashMap;

public class OrderRepo {
    // Meine Orderliste
    private HashMap<String,Order> ordersList;

    //Alle Bestellungen ausgeben
    public HashMap<String, Order> orderlist (){
        return  ordersList;
    }


    //Einzelne Bestellungen ausgeben anhand der id
    public HashMap<String, Order> newOrder(String Id){
        if(ordersList.containsKey(Id)) System.out.println(ordersList.get(Id));
        else throw new IllegalArgumentException("Order is not exist");
        return null;

    }


    //Neues Product anlegen und bestellen
    public Order add(HashMap<String, Product> newProductOrder){
        if (ordersList == null){
            ordersList = new HashMap<>();
        }
        String id = String.valueOf(ordersList.size());
        return new Order(id, newProductOrder );

    }





    }




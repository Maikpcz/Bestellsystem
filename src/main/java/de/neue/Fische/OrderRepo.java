package de.neue.Fische;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderRepo {
    // Meine Orderliste
    HashMap<Integer,Order> ordersList = new HashMap<>();






    //Alle Bestellungen ausgeben
    public HashMap<Integer, Order> orderlist (){
        return ordersList;
    }


    //Einzelne Bestellungen ausgeben anhand der id
    public Order findOrderByID(int Id){
        if(ordersList.containsKey(Id))
            return ordersList.get(Id);
        else throw new IllegalArgumentException("Order is not exist");


    }
    public Order getOrder(Integer orderKey){
        return ordersList.get(orderKey);
    }


    //Neues Product anlegen und bestellen
    public Order addNewOrderAndOrderIt(HashMap<Integer, Product> newProduct){
        if (ordersList == null){
            ordersList = new HashMap<>();
        }
        String id = String.valueOf(ordersList.size());
        return new Order(Integer.parseInt(id),newProduct );

    }


    public OrderRepo() {
        this.ordersList = ordersList;
    }

    public HashMap<Integer, Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(HashMap<Integer, Order> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "ordersList=" + ordersList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(ordersList, orderRepo.ordersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersList);
    }
}




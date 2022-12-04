package de.neue.Fische;


import java.util.HashMap;

public class ShopService {
    private OrderRepo orderRepo;
    private ProductRepo productRepo;
    public HashMap<Integer, Order> ordersList = new HashMap<>();
    public HashMap<Integer,Product> productList = new HashMap<>();


    public HashMap<Integer, Order> orderlist (){
        return  this.ordersList;
    }
    public String listProducts() {
        return productList.toString();
    }


    public Order findOrderByID(String Id){
        if(ordersList.containsKey(Id))
            return ordersList.get(Id);
        else throw new IllegalArgumentException("Order is not exist");}

    public Order addNewOrderAndOrderIt(HashMap<Integer, Product> newProduct){
        if (ordersList == null){
            ordersList = new HashMap<>();
        }
        String id = String.valueOf(ordersList.size());
        return new Order(Integer.parseInt(id),newProduct );



}}



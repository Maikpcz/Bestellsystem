package de.neue.Fische;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderRepoTest {

    @Test
    void FindOrderByID() {
        //given
        HashMap<Integer,Product> produt = new HashMap<>();
        produt.put(1,new Product(1,"Gabel"));
        HashMap<Integer,Order> orderList = new HashMap<>(Map.of(
                1, new Order(2,produt)
        ));OrderRepo orderRepo = new OrderRepo(orderList);
        //when
       Order actual =orderRepo.findOrderByID(2);
        //then
       //assertEquals(actual,orderList);
    }
    @Test
    void ListAllOrders(){
        //given
        HashMap<Integer,Product> produt = new HashMap<>();
        produt.put(1,new Product(1,"Gabel"));
        HashMap<Integer,Order> orderTest = new HashMap<>();
        orderTest.put(2,new Order(2,produt));
        OrderRepo orderRepo = new OrderRepo(orderTest);
        //when
        HashMap actual = orderRepo.getOrdersList(orderTest);
        //then
        //assertEquals(actual,orderTest.put(2,new Order(2,produt)));
    }
}
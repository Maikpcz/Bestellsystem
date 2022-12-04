package de.neue.Fische;

import org.junit.jupiter.api.Assertions;
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
        ));OrderRepo orderRepo = new OrderRepo();

        //when
       Order actual = orderRepo.findOrderByID(2);
        //then
        assertEquals(orderList,actual);
    }
    @Test
    void ListAllOrders(){
        //given
        HashMap<Integer,Product> produt = new HashMap<>();
        produt.put(1,new Product(1,"Gabel"));
        HashMap<Integer,Order> orderTest = new HashMap<>();
        orderTest.put(2,new Order(2,produt));
        OrderRepo orderRepo = new OrderRepo();
        //when
        HashMap actual = orderRepo.getOrdersList();
        //then
        assertEquals(orderTest,actual);
    }
}
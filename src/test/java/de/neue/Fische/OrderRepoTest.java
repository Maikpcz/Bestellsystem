package de.neue.Fische;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderRepoTest {
    @Test
    void getID (){
        //given
        Product ordertest = new Product();
        ordertest.setId(5);
        //when
        Integer actual = ordertest.getId();
        //then
        assertEquals(ordertest.getId(),actual);
    }
    @Test
     void getProductName (){
        //given
        Product ordertest = new Product();
        //when
        String actual = ordertest.setName("Maik");
        //Then
        assertEquals(ordertest.getName(),actual);

    }
    @Test
    void whenGetProductlist_returnTheProductlist(){
        Product product = new Product();
    }

}
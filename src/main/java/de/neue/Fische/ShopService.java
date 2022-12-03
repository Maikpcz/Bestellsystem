package de.neue.Fische;


public class ShopService {

    Product produt1; {new Product(1, "Gabel");}
    Product product2;{new Product(2, "Messer");}
    Product product3;{new Product(3, "Fahrrad");}
    Product product4; {new Product(4,"Katze");}

    Order order1 ;{ new Order("2",produt1,product4,product2);}
    Order order2 ;{ new Order("3", produt1,product2,product3);}
    Order order3 ;{ new Order("4", produt1,product4,product3);}



}



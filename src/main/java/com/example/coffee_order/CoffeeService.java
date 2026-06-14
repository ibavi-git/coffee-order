package com.example.coffee_order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    private List<CoffeeOrder> orders = new ArrayList<>();
    int counter =1;
    public CoffeeOrder orderCoffee(CoffeeOrder order){
        order.setId(counter++);
        orders.add(order);

        return order;
    }

    public List<CoffeeOrder> getOrders(){
        return orders;
    }
}

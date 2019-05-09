package com.restaurant.Repository.Implementation.OrderImplementation;

import com.restaurant.Domain.Order.OrderStatusTest;

public class OrderStatusImplementationTest {
    public static OrderStatusTest getOrderStatus(String status){
        return new OrderStatusTest.Builder().status(status)
                .build();
    }
}

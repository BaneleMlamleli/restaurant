package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.OrderStatusTest;

public class OrderStatusRepositoryTest {
    public static OrderStatusTest getOrderStatus(String status){
        return new OrderStatusTest.Builder().status(status)
                .build();
    }
}

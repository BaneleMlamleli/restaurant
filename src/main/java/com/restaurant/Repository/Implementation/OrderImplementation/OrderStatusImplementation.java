package com.restaurant.Repository.Implementation.OrderImplementation;

import com.restaurant.Domain.Order.OrderStatus;

public class OrderStatusImplementation {
    public static OrderStatus getOrderStatus(String status){
        return new OrderStatus.Builder().status(status)
                .build();
    }
}

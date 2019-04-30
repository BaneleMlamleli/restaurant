package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.OrderStatus;

public class OrderStatusRepository {
    public static OrderStatus getOrderStatus(String status){
        return new OrderStatus.Builder().status(status)
                .build();
    }
}

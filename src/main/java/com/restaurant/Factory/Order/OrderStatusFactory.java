package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.OrderStatus;

public class OrderStatusFactory {
    public static OrderStatus getOrderStatus(String status) {
        return new OrderStatus.Builder().status(status)
                .build();
    }
}

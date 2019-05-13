package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.OrderStatus;

public class OrderStatusFactory {
    private static OrderStatus getOrderStatus(String status) {
        return new OrderStatus.Builder().status(status)
                .build();
    }
}

package com.restaurant.Repository.Order;


import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface OrderStatusRepository extends MainInterface<OrderStatus, String> {
    Set<OrderStatus> getAll();
}

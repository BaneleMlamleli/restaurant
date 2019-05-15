package com.restaurant.Service.Order;

import com.restaurant.Domain.Order.Order;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface OrderService extends MainInterfaceService<Order, String> {
    Set<Order> getAll();
}
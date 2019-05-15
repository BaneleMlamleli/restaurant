package com.restaurant.Service.Order;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface OrderStatusService extends MainInterfaceService<OrderStatus, String> {
    Set<OrderStatus> getAll();
}

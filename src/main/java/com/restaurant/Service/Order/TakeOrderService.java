package com.restaurant.Service.Order;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface TakeOrderService extends MainInterfaceService<TakeOrder, String> {
    Set<TakeOrder> getAll();
}

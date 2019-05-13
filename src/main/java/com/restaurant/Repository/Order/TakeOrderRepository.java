/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

/**
 *
 * @author banelemlamleli
 */
public interface TakeOrderRepository extends MainInterface<TakeOrder, String> {
    Set<TakeOrder> getAll();
}

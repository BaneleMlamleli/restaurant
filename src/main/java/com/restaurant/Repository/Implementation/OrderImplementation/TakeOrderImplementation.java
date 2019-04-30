/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Implementation.OrderImplementation;

import com.restaurant.Domain.Order.TakeOrder;

/**
 *
 * @author banelemlamleli
 */
public class TakeOrderImplementation {
    public static TakeOrder getTakeOrder(boolean selectedRadioButtonItem, String order_name){
        return new TakeOrder.Builder().selectedRadioButtonItem(selectedRadioButtonItem)
                .order_name(order_name)
                .build();
    }
}

package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.TakeOrder;

public class TakeOrderFactory {
    public static TakeOrder getTakeOrder(boolean selectedRadioButtonItem, String order_name){
        return new TakeOrder.Builder().selectedRadioButtonItem(selectedRadioButtonItem)
                .order_name(order_name)
                .build();
    }
}

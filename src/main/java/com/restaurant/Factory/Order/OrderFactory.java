package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.Order;

public class OrderFactory {
    public static Order getOrder(int order_id, String comment, String order_name, String table_name, String waiter_name, String order_status, String order_date, double order_bill){
        return new Order.Builder().order_id(order_id)
                .comment(comment)
                .order_name(order_name)
                .table_name(table_name)
                .waiter_name(waiter_name)
                .order_status(order_status)
                .order_date(order_date)
                .order_bill(order_bill)
                .build();
    }
}

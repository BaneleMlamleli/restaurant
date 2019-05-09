/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.OrderTest;

/**
 *
 * @author Shaun
 */
public class OrderRepositoryTest {
    public static OrderTest getOrder(int order_id, String comment, String order_name, String table_name, String waiter_name, String order_status, String order_date, double order_bill){
        return new OrderTest.Builder().order_id(order_id)
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
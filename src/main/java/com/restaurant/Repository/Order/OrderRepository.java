/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Order;

/**
 *
 * @author Shaun
 */
public class OrderRepository {
    private int order_id;
    private String comment;
    private String order_name;
    private String table_name;
    private String waiter_name;
    private String order_status;
    private String order_date;
    private double order_bill;

    public OrderRepository() {
    }

    public OrderRepository(int order_id, String comment, String order_name, String table_name, String waiter_name, String order_status, String order_date, double order_bill) {
        this.order_id = order_id;
        this.comment = comment;
        this.order_name = order_name;
        this.table_name = table_name;
        this.waiter_name = waiter_name;
        this.order_status = order_status;
        this.order_date = order_date;
        this.order_bill = order_bill;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getWaiter_name() {
        return waiter_name;
    }

    public void setWaiter_name(String waiter_name) {
        this.waiter_name = waiter_name;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public double getOrder_bill() {
        return order_bill;
    }

    public void setOrder_bill(double order_bill) {
        this.order_bill = order_bill;
    }

    @Override
    public String toString() {
        return "OrderRepository{" + "order_id=" + order_id + ", comment=" + comment + ", order_name=" + order_name + ", table_name=" + table_name + ", waiter_name=" + waiter_name + ", order_status=" + order_status + ", order_date=" + order_date + ", order_bill=" + order_bill + '}';
    }    
}
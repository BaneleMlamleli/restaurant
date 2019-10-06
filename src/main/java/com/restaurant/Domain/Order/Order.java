/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain.Order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Shaun
 */
@Entity
public class Order {
    @Id
    private int order_id;
    private String comment;
    private String order_name;
    private String table_name;
    private String waiter_name;
    private String order_status;
    private String order_date;
    private float order_bill;

    private Order(Order order){

    }

    private Order(Builder builder){
        this.order_id = builder.order_id;
        this.comment = builder.comment;
        this.order_name = builder.order_name;
        this.table_name = builder.table_name;
        this.waiter_name = builder.waiter_name;
        this.order_status = builder.order_status;
        this.order_date = builder.order_date;
        this.order_bill = builder.order_bill;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getComment() {
        return comment;
    }

    public String getOrder_name() {
        return order_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public String getWaiter_name() {
        return waiter_name;
    }

    public String getOrder_status() {
        return order_status;
    }

    public String getOrder_date() {
        return order_date;
    }

    public float getOrder_bill() {
        return order_bill;
    }

    public static class Builder {
        private int order_id;
        private String comment;
        private String order_name;
        private String table_name;
        private String waiter_name;
        private String order_status;
        private String order_date;
        private float order_bill;

        public Builder order_id(int order_id) {
            this.order_id = order_id;
            return this;
        }

        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder order_name(String order_name) {
            this.order_name = order_name;
            return this;
        }

        public Builder table_name(String table_name) {
            this.table_name = table_name;
            return this;
        }

        public Builder waiter_name(String waiter_name) {
            this.waiter_name = waiter_name;
            return this;
        }

        public Builder order_status(String order_status) {
            this.order_status = order_status;
            return this;
        }

        public Builder order_date(String order_date) {
            this.order_date = order_date;
            return this;
        }

        public Builder order_bill(float order_bill) {
            this.order_bill = order_bill;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

        public Order.Builder copy(Order savedOrder) {
            this.order_id = savedOrder.order_id;
            this.comment = savedOrder.comment;
            this.order_name = savedOrder.order_name;
            this.table_name = savedOrder.table_name;
            this.waiter_name = savedOrder.waiter_name;
            this.order_status = savedOrder.order_status;
            this.order_date = savedOrder.order_date;
            this.order_bill = savedOrder.order_bill;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", comment='" + comment + '\'' +
                ", order_name='" + order_name + '\'' +
                ", table_name='" + table_name + '\'' +
                ", waiter_name='" + waiter_name + '\'' +
                ", order_status='" + order_status + '\'' +
                ", order_date='" + order_date + '\'' +
                ", order_bill=" + order_bill +
                '}';
    }
}
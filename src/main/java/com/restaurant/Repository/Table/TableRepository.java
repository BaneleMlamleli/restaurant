/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Table;

/**
 *
 * @author Shaun
 */
public class TableRepository {
    private int table_id;
    private String table_status;
    private String table_name;
    private String waiter_name;

    public TableRepository() {
    }

    public TableRepository(int table_id, String table_status, String table_name, String waiter_name) {
        this.table_id = table_id;
        this.table_status = table_status;
        this.table_name = table_name;
        this.waiter_name = waiter_name;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getTable_status() {
        return table_status;
    }

    public void setTable_status(String table_status) {
        this.table_status = table_status;
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

    @Override
    public String toString() {
        return "TableRepository{" + "table_id=" + table_id + ", table_status=" + table_status + ", table_name=" + table_name + ", waiter_name=" + waiter_name + '}';
    }
}

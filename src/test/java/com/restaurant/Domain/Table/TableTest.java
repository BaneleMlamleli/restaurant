/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain.Table;

/**
 *
 * @author Shaun
 */
public class TableTest {
    private int table_id;
    private String table_status;
    private String table_name;
    private String waiter_name;

    private TableTest(TableTest tableTest){

    }

    private TableTest(Builder builder){
        this.table_id = builder.table_id;
        this.table_status = builder.table_status;
        this.table_name = builder.table_name;
        this.waiter_name = builder.waiter_name;
    }

    public int getTable_id() {
        return table_id;
    }

    public String getTable_status() {
        return table_status;
    }

    public String getTable_name() {
        return table_name;
    }

    public String getWaiter_name() {
        return waiter_name;
    }

    public static class Builder {
        private int table_id;
        private String table_status;
        private String table_name;
        private String waiter_name;

        public Builder table_id(int table_id){
            this.table_id = table_id;
            return this;
        }

        public Builder table_status(String table_status) {
            this.table_status = table_status;
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

        public TableTest build(){
            return new TableTest(this);
        }
    }

    @Override
    public String toString() {
        return "TableRepositoryTest{" + "table_id=" + table_id + ", table_status=" + table_status + ", table_name=" + table_name + ", waiter_name=" + waiter_name + '}';
    }
}
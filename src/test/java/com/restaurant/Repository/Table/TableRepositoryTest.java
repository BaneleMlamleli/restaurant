/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Table;

import com.restaurant.Domain.Table.TableTest;

/**
 *
 * @author Shaun
 */
public class TableRepositoryTest {
    public TableTest getTable(int table_id, String table_status, String table_name, String waiter_name){
        return new TableTest.Builder().table_id(table_id)
                .table_status(table_status)
                .table_name(table_name)
                .waiter_name(waiter_name)
                .build();
    }
}

package com.restaurant.Factory.Table;

import com.restaurant.Domain.Table.Table;

public class TableFactory {
    public static Table getStock(int table_id, String table_status, String table_name, String waiter_name){
        return new Table.Builder().table_id(table_id)
                .table_status(table_status)
                .table_name(table_name)
                .waiter_name(waiter_name)
                .build();
    }
}

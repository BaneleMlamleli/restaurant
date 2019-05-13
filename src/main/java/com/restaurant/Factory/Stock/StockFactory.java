package com.restaurant.Factory.Stock;

import com.restaurant.Domain.Stock.Stock;

public class StockFactory {
    public static Stock getStock(String itemName, int usage){
        return new Stock.Builder().itemName(itemName)
                .usage(usage)
                .build();
    }
}

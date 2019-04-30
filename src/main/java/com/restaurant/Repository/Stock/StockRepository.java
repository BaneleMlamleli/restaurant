/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Stock;

import com.restaurant.Domain.Stock.Stock;

/**
 *
 * @author banelemlamleli
 */
public class StockRepository {
    public static Stock getStock(String itemName, int usage){
        return new Stock.Builder().itemName(itemName)
                .usage(usage)
                .build();
    }
}

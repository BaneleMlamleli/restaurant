/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Implementation.StockImplementation;

import com.restaurant.Domain.Stock.StockTest;

/**
 *
 * @author banelemlamleli
 */
public class StockImplementationTest {
    public static StockTest getStock(String itemName, int usage){
        return new StockTest.Builder().itemName(itemName)
                .usage(usage)
                .build();
    }
}

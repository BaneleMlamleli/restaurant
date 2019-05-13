/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

/**
 *
 * @author banelemlamleli
 */
public interface StockRepository extends MainInterface<Stock, String> {
    Set<Stock> getAll();
}

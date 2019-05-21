package com.restaurant.Service.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface StockService extends MainInterfaceService<Stock, String> {
    Set<Stock> getAll();
}

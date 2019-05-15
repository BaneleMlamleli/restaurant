package com.restaurant.Controller.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Factory.Stock.StockFactory;
import com.restaurant.Service.Stock.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("restaurant/stock")
public class StockController {
    @Autowired
    private StockServiceImpl service;
    @GetMapping("/create/{itemName}/{usage}")
    public @ResponseBody
    Stock create(@PathVariable String itemName, @PathVariable int usage){
        Stock stock = StockFactory.getStock(itemName, usage);
        return service.create(stock);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Stock> getAll(){
        return service.getAll();
    }
}

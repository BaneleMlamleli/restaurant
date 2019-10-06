package com.restaurant.Service.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Repository.Stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class StockServiceImpl implements StockService {

    private static StockServiceImpl service = null;
    @Autowired
    private StockRepository stockRepository;

    private StockServiceImpl() {
//        this.stockRepository = StockImplementation.getRepository();
    }

    public static StockServiceImpl getService(){
        if (service == null) service = new StockServiceImpl();
        return service;
    }

    @Override
    public Set<Stock> getAll() {
        return (Set<Stock>) this.stockRepository.findAll();
    }

    @Override
    public Stock create(Stock stock) {
        return this.stockRepository.save(stock);
    }

    @Override
    public Stock update(Stock stock) {
        return this.stockRepository.save(stock);
    }

    @Override
    public void delete(String s) {
        this.stockRepository.deleteById(s);
    }

    @Override
    public Stock read(String s) {
        Optional<Stock> order = this.stockRepository.findById(s);
        return order.orElse(null);
    }
}

package com.restaurant.Service.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Repository.Implementation.StockImplementation.StockImplementation;
import com.restaurant.Repository.Stock.StockRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StockServiceImpl implements StockService {

    private static StockServiceImpl service = null;
    private StockRepository repository;

    private StockServiceImpl() {
        this.repository = StockImplementation.getRepository();
    }

    public static StockServiceImpl getService(){
        if (service == null) service = new StockServiceImpl();
        return service;
    }

    @Override
    public Stock create(Stock stock) {
        return this.repository.create(stock);
    }

    @Override
    public Stock update(Stock stock) {
        return this.repository.update(stock);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Stock read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Stock> getAll() {
        return this.repository.getAll();
    }
}

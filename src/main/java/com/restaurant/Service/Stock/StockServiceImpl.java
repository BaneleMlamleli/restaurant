package com.restaurant.Service.Stock;

import com.restaurant.Repository.Stock.StockRepository;

import java.util.Set;

public class StockServiceImpl implements StockService {

    private static StockServiceImpl service = null;
    private StockRepository repository;

    private StockServiceImpl() {
        this.repository = StockImplementation.getRepository();
    }

    public static StockServiceImpl getService(){
        if (service == null) service = new RegisterNewUserServiceImpl();
        return service;
    }

    @Override
    public RegisterNewUser create(RegisterNewUser registerNewUser) {
        return this.repository.create(registerNewUser);
    }

    @Override
    public RegisterNewUser update(RegisterNewUser course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public RegisterNewUser read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<RegisterNewUser> getAll() {
        return this.repository.getAll();
    }
}

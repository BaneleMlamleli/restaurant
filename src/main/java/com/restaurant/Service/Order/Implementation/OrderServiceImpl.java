package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Order.Order;
import com.restaurant.Repository.Implementation.OrderImplementation.OrderImplementation;
import com.restaurant.Repository.Order.OrderRepository;
import com.restaurant.Service.Order.OrderService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {

    private static OrderServiceImpl service = null;
    private OrderRepository repository;

    private OrderServiceImpl() {
        this.repository = OrderImplementation.getRepository();
    }

    public static OrderServiceImpl getService(){
        if (service == null) service = new OrderServiceImpl();
        return service;
    }

    @Override
    public Order create(Order order) {
        return this.repository.create(order);
    }

    @Override
    public Order update(Order order) {
        return this.repository.update(order);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Order read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Order> getAll() {
        return this.repository.getAll();
    }
}

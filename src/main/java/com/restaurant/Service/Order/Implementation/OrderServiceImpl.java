package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Order.Order;
import com.restaurant.Repository.Order.OrderRepository;
import com.restaurant.Service.Order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {

    private static OrderServiceImpl service = null;
    @Autowired
    private OrderRepository orderRepository;

    private OrderServiceImpl() {
        //this.orderRepository = OrderImplementation.getRepository();
    }

    public static OrderServiceImpl getService(){
        if (service == null) service = new OrderServiceImpl();
        return service;
    }

    @Override
    public Set<Order> getAll() {
        return (Set<Order>) this.orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public void delete(String s) {
        this.orderRepository.deleteById(s);
    }

    @Override
    public Order read(String s) {
        Optional<Order> order = this.orderRepository.findById(s);
        return order.orElse(null);
    }
}

package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Repository.Implementation.LoginImplementation.RegisterNewUserImplementation;
import com.restaurant.Repository.Implementation.OrderImplementation.OrderStatusImplementation;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import com.restaurant.Repository.Order.OrderStatusRepository;
import com.restaurant.Service.Login.RegisterNewUserService;
import com.restaurant.Service.Order.OrderStatusService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    private static OrderStatusServiceImpl service = null;
    private OrderStatusRepository repository;

    private OrderStatusServiceImpl() {
        this.repository = OrderStatusImplementation.getRepository();
    }

    public static OrderStatusServiceImpl getService(){
        if (service == null) service = new OrderStatusServiceImpl();
        return service;
    }

    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        return this.repository.create(orderStatus);
    }

    @Override
    public OrderStatus update(OrderStatus orderStatus) {
        return this.repository.update(orderStatus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OrderStatus read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<OrderStatus> getAll() {
        return this.repository.getAll();
    }
}

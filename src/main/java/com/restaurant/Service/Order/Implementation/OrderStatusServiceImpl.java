package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Repository.Order.OrderStatusRepository;
import com.restaurant.Service.Order.OrderStatusService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    private static OrderStatusServiceImpl service = null;
    private OrderStatusRepository orderStatusRepository;

    private OrderStatusServiceImpl() {
//        this.orderStatusRepository = OrderStatusImplementation.getRepository();
    }

    public static OrderStatusServiceImpl getService(){
        if (service == null) service = new OrderStatusServiceImpl();
        return service;
    }

    @Override
    public Set<OrderStatus> getAll() {
        return (Set<OrderStatus>) this.orderStatusRepository.findAll();
    }

    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        return this.orderStatusRepository.save(orderStatus);
    }

    @Override
    public OrderStatus update(OrderStatus order) {
        return this.orderStatusRepository.save(order);
    }

    @Override
    public void delete(String s) {
        this.orderStatusRepository.deleteById(s);
    }

    @Override
    public OrderStatus read(String s) {
        Optional<OrderStatus> order = this.orderStatusRepository.findById(s);
        return order.orElse(null);
    }
}

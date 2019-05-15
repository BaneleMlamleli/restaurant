package com.restaurant.Controller.Order;

import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Factory.Order.OrderStatusFactory;
import com.restaurant.Service.Order.Implementation.OrderStatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("restaurant/orderStatus")
public class OrderStatusController {
    @Autowired
    private OrderStatusServiceImpl service;

    @GetMapping("/create/{status}")
    public @ResponseBody
    OrderStatus create(@PathVariable String status){
        OrderStatus orderStatus = OrderStatusFactory.getOrderStatus(status);
        return service.create(orderStatus);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<OrderStatus> getAll(){
        return service.getAll();
    }
}
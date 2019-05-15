package com.restaurant.Controller.Order;

import com.restaurant.Domain.Order.Order;
import com.restaurant.Factory.Order.OrderFactory;
import com.restaurant.Service.Order.Implementation.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("restaurant/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl service;
    @GetMapping("/create/{order_id}/{comment}/{order_name}/{table_name}/{waiter_name}/{order_status}/{order_date}/{order_bill}")
    public @ResponseBody
    Order create(@PathVariable int order_id, @PathVariable String comment, @PathVariable String order_name, @PathVariable String table_name,
                 @PathVariable String waiter_name, @PathVariable String order_status, @PathVariable String order_date, @PathVariable double order_bill){
        Order order = OrderFactory.getOrder(order_id, comment, order_name, table_name, waiter_name, order_status, order_date, order_bill);
        return service.create(order);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Order> getAll(){
        return service.getAll();
    }
}

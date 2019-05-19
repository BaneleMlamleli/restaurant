package com.restaurant.Controller.Order;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Factory.Login.RegisterNewUserFactory;
import com.restaurant.Factory.Order.TakeOrderFactory;
import com.restaurant.Service.Login.Implementation.RegisterNewUserServiceImpl;
import com.restaurant.Service.Order.Implementation.TakeOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("restaurant/takeOrder")
public class TakeOrderController {
    @Autowired
    private TakeOrderServiceImpl service;

    @PostMapping("/create/{selectedRadioButtonItem}/{order_name}")
    public @ResponseBody
    TakeOrder create(@PathVariable boolean selectedRadioButtonItem, @PathVariable String order_name){
        TakeOrder takeOrder = TakeOrderFactory.getTakeOrder(selectedRadioButtonItem, order_name);
        return service.create(takeOrder);
    }

    @GetMapping("read/getall")
    @ResponseBody
    public Set<TakeOrder> getAll(){
        return service.getAll();
    }

    @PostMapping("/update")
    @ResponseBody
    public TakeOrder update(TakeOrder takeOrder) {
        return service.update(takeOrder);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}

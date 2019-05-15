package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Repository.Implementation.LoginImplementation.RegisterNewUserImplementation;
import com.restaurant.Repository.Implementation.OrderImplementation.TakeOrderImplementation;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import com.restaurant.Repository.Order.TakeOrderRepository;
import com.restaurant.Service.Login.RegisterNewUserService;
import com.restaurant.Service.Order.TakeOrderService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TakeOrderServiceImpl implements TakeOrderService {

    private static TakeOrderServiceImpl service = null;
    private TakeOrderRepository repository;

    private TakeOrderServiceImpl() {
        this.repository = TakeOrderImplementation.getRepository();
    }

    public static TakeOrderServiceImpl getService(){
        if (service == null) service = new TakeOrderServiceImpl();
        return service;
    }

    @Override
    public TakeOrder create(TakeOrder takeOrder) {
        return this.repository.create(takeOrder);
    }

    @Override
    public TakeOrder update(TakeOrder takeOrder) {
        return this.repository.update(takeOrder);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public TakeOrder read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<TakeOrder> getAll() {
        return this.repository.getAll();
    }
}

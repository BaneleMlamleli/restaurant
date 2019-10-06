package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import com.restaurant.Repository.Order.TakeOrderRepository;
import com.restaurant.Service.Order.TakeOrderService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class TakeOrderServiceImpl implements TakeOrderService {

    private static TakeOrderServiceImpl service = null;
    private TakeOrderRepository takeOrderRepository;

    private TakeOrderServiceImpl() {
//        this.takeOrderRepository = TakeOrderImplementation.getRepository();
    }

    public static TakeOrderServiceImpl getService(){
        if (service == null) service = new TakeOrderServiceImpl();
        return service;
    }

    @Override
    public Set<TakeOrder> getAll() {
        return (Set<TakeOrder>) this.takeOrderRepository.findAll();
    }

    @Override
    public TakeOrder create(TakeOrder takeOrder) {
        return this.takeOrderRepository.save(takeOrder);
    }

    @Override
    public TakeOrder update(TakeOrder order) {
        return this.takeOrderRepository.save(order);
    }

    @Override
    public void delete(String s) {
        this.takeOrderRepository.deleteById(s);
    }

    @Override
    public TakeOrder read(String s) {
        Optional<TakeOrder> order = this.takeOrderRepository.findById(s);
        return order.orElse(null);
    }
}

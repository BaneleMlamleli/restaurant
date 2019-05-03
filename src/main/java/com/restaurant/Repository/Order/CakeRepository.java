package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.Cake;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface CakeRepository extends MainInterface<Cake,String> {
    Set<Cake> getAll();
}

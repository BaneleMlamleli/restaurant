package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.Drinks;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface DrinksRepository extends MainInterface<Drinks,String> {
    Set<Drinks> getAll();
}

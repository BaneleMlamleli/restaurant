package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.Dessert;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface DessertRepository extends MainInterface<Dessert, String> {
    Set<Dessert> getAll();
}

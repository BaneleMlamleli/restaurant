package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.Dessert;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface DessertRepository extends JpaRepository<Dessert, String> { //MainInterface<Dessert, String> {
//    Set<Dessert> getAll();
}

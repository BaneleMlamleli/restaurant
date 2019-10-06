package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.Drinks;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface DrinksRepository extends JpaRepository<Drinks,String> {//MainInterface<Drinks,String> {
//    Set<Drinks> getAll();
}

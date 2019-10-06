package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.Cake;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CakeRepository extends JpaRepository<Cake,String> { //MainInterface<Cake,String> {
//    Set<Cake> getAll();
}

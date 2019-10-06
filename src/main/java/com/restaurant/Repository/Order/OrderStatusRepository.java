package com.restaurant.Repository.Order;


import com.restaurant.Domain.Order.OrderStatus;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, String> { //MainInterface<OrderStatus, String> {
//    Set<OrderStatus> getAll();
}

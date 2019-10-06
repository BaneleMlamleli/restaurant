package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.CustardAndPudding;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CustardAndPuddingRepository extends JpaRepository<CustardAndPudding,String> {//MainInterface<CustardAndPudding,String> {
//    Set<CustardAndPudding> getAll();
}

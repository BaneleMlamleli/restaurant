package com.restaurant.Repository.Order;

import com.restaurant.Domain.Order.CustardAndPudding;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface CustardAndPuddingRepository extends MainInterface<CustardAndPudding,String> {
    Set<CustardAndPudding> getAll();
}

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.TakeOrder;
//import com.restaurant.Repository.Order.TakeOrderRepository;
//
//import java.util.*;
//
///**
// *
// * @author banelemlamleli
// */
//public class TakeOrderImplementation implements TakeOrderRepository {
//
//    private static TakeOrderImplementation takeOrderImplementation = null;
//    private Map<String, TakeOrder> takeOrderMap;
//
//    private TakeOrderImplementation(){
//        takeOrderMap = new HashMap<>();
//    }
//
//    public static TakeOrderRepository getRepository(){
//        if ( takeOrderImplementation == null){
//            takeOrderImplementation = new TakeOrderImplementation();
//        }
//        return  takeOrderImplementation;
//    }
//
//    @Override
//    public Set<TakeOrder> getAll() {
//        Collection<TakeOrder> allOrders = this.takeOrderMap.values();
//        Set<TakeOrder> set = new HashSet<>();
//        set.addAll(allOrders);
//        return set;
//    }
//
//    @Override
//    public TakeOrder create(TakeOrder takeOrder) {
//        takeOrderMap.put(takeOrder.toString(), takeOrder);
//        TakeOrder creadOrder = takeOrderMap.get(takeOrder.toString());
//        return creadOrder;
//    }
//
//    @Override
//    public TakeOrder read(String s) {
//        TakeOrder readTakeOrder = takeOrderMap.get(s);
//        return readTakeOrder;
//    }
//
//    @Override
//    public TakeOrder update(TakeOrder takeOrder) {
//        takeOrderMap.put(takeOrder.toString(), takeOrder);
//        TakeOrder updateOrder = takeOrderMap.get(takeOrder.toString());
//        return updateOrder;
//    }
//
//    @Override
//    public void delete(String s) {
//        takeOrderMap.remove(s);
//    }
//}

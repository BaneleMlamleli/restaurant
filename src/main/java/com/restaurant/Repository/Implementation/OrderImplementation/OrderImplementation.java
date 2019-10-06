///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.Order;
//import com.restaurant.Repository.Order.OrderRepository;
//
//import java.util.*;
//
///**
// *
// * @author Shaun
// */
//public class OrderImplementation implements OrderRepository {
//
//    private static OrderImplementation orderImplementation = null;
//    private Map<String, Order> orderMap;
//
//    private OrderImplementation(){
//        orderMap = new HashMap<>();
//    }
//
//    public static OrderRepository getRepository(){
//        if ( orderImplementation == null){
//            orderImplementation = new OrderImplementation();
//        }
//        return  orderImplementation;
//    }
//
//    @Override
//    public Set<Order> getAll() {
//        Collection<Order> allOrders = this.orderMap.values();
//        Set<Order> set = new HashSet<>();
//        set.addAll(allOrders);
//        return set;
//    }
//
//    @Override
//    public Order create(Order order) {
//        orderMap.put(order.getOrder_name(), order);
//        Order reg = orderMap.get(order.getOrder_name());
//        return reg;
//    }
//
//    @Override
//    public Order read(String s) {
//        Order readOrder = orderMap.get(s);
//        return readOrder;
//    }
//
//    @Override
//    public Order update(Order order) {
//        orderMap.put(order.getOrder_name(), order);
//        Order reg = orderMap.get(order.getOrder_name());
//        return reg;
//    }
//
//    @Override
//    public void delete(String s) {
//        orderMap.remove(s);
//    }
//}
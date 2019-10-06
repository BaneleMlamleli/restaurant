//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.OrderStatus;
//import com.restaurant.Repository.Order.OrderStatusRepository;
//
//import java.util.*;
//
//public class OrderStatusImplementation implements OrderStatusRepository {
//
//    private static OrderStatusImplementation orderStatusImplementation = null;
//    private Map<String, OrderStatus> orderStatusMap;
//
//    private OrderStatusImplementation(){
//        orderStatusMap = new HashMap<>();
//    }
//
//    public static OrderStatusRepository getRepository(){
//        if ( orderStatusImplementation == null){
//            orderStatusImplementation = new OrderStatusImplementation();
//        }
//        return  orderStatusImplementation;
//    }
//
//    @Override
//    public Set<OrderStatus> getAll() {
//        Collection<OrderStatus> allOrderStatus = this.orderStatusMap.values();
//        Set<OrderStatus> set = new HashSet<>();
//        set.addAll(allOrderStatus);
//        return set;
//    }
//
//    @Override
//    public OrderStatus create(OrderStatus orderStatus) {
//        orderStatusMap.put(orderStatus.getStatus(), orderStatus);
//        OrderStatus createOrderStatus = orderStatusMap.get(orderStatus.getStatus());
//        return createOrderStatus;
//    }
//
//    @Override
//    public OrderStatus read(String s) {
//        OrderStatus readOrderStatus = orderStatusMap.get(s);
//        return readOrderStatus;
//    }
//
//    @Override
//    public OrderStatus update(OrderStatus orderStatus) {
//        orderStatusMap.put(orderStatus.getStatus(), orderStatus);
//        OrderStatus updateOrderStatus = orderStatusMap.get(orderStatus.getStatus());
//        return updateOrderStatus;
//    }
//
//    @Override
//    public void delete(String s) {
//        orderStatusMap.remove(s);
//    }
//}

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.Order;
//import com.restaurant.Factory.Order.OrderFactory;
//import com.restaurant.Repository.Order.OrderRepository;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Set;
//
///**
// *
// * @author Shaun
// */
//public class OrderImplementationTest {
//    private OrderRepository repository;
//    private Order userAccessRight;
//
//    private Order getSavedOrder() {
//        Set<Order> savedOrder = this.repository.getAll();
//        return savedOrder.iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = OrderImplementation.getRepository();
//        this.userAccessRight = OrderFactory.getOrder(2, "Test", "Rice", "Table 1", "Banele", "In-progress", "12/12/12", 12.2);
//    }
//
//    @Test
//    public void a_create() {
//        Order created = this.repository.create(this.userAccessRight);
//        System.out.println("In create, created = " + created);
//        d_getAll();
//        Assert.assertSame(created, this.userAccessRight);
//    }
//
//    @Test
//    public void b_read() {
//        Order savedOrder = getSavedOrder();
//        System.out.println("In read, courseId = "+ savedOrder.getOrder_name());
//        Order read = this.repository.read(savedOrder.getOrder_name());
//        System.out.println("In read, read = " + read);
//        d_getAll();
//        Assert.assertEquals(savedOrder, read);
//    }
//
//    @Test
//    public void e_delete() {
//        Order savedOrder = getSavedOrder();
//        this.repository.delete(Integer.toString(savedOrder.getOrder_id()));
//        d_getAll();
//    }
//
//    @Test
//    public void c_update() {
//        Order savedOrder = getSavedOrder();
//        String orderName = "Sushi";
//        Order userAccessRght= new Order.Builder().copy(getSavedOrder()).build();
//        System.out.println("In update, about_to_updated = " + userAccessRght);
//        Order updated = this.repository.update(userAccessRght);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(orderName, updated.getOrder_name());
//        d_getAll();
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Order> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
//    }
//}
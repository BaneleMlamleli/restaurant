//package com.restaurant.Service.Order.Implementation;
//
//import com.restaurant.Domain.Order.OrderStatus;
//import com.restaurant.Factory.Order.OrderStatusFactory;
//import com.restaurant.Repository.Implementation.OrderImplementation.OrderStatusImplementation;
//import com.restaurant.Repository.Order.OrderStatusRepository;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class OrderStatusServiceImplTest {
//
//    private OrderStatusImplementation repository;
//    private OrderStatus course;
//
//    private OrderStatus getSaved(){
//        return this.repository.getAll().iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = (OrderStatusImplementation) OrderStatusImplementation.getRepository();
//        this.course = OrderStatusFactory.getOrderStatus("In-progress");
//    }
//
//    @Test
//    public void a_create() {
//        OrderStatus created = this.repository.create(this.course);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.course);
//    }
//
//    @Test
//    public void c_update() {
//        String newOrderStatusName = "Application Development Theory 3";
//        OrderStatus updated = new OrderStatus.Builder().copy(getSaved()).status("In-progress").build();
//        System.out.println("In update, updated = " + updated);
//        this.repository.update(updated);
//        Assert.assertSame(newOrderStatusName, updated.getStatus());
//    }
//
//    @Test
//    public void e_delete() {
//        OrderStatus saved = getSaved();
//        this.repository.delete(saved.getStatus());
//        d_getAll();
//    }
//
//    @Test
//    public void b_read() {
//        OrderStatus saved = getSaved();
//        OrderStatus read = this.repository.read(saved.getStatus());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<OrderStatus> courses = this.repository.getAll();
//        System.out.println("In getall, all = " + courses);
//    }
//}
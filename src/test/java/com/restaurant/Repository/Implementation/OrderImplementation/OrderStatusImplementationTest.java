//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.OrderStatus;
//import com.restaurant.Domain.Order.OrderStatusTest;
//import com.restaurant.Factory.Order.OrderStatusFactory;
//import com.restaurant.Repository.Order.OrderStatusRepository;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Set;
//
//public class OrderStatusImplementationTest {
//    private OrderStatusRepository repository;
//    private OrderStatus userAccessRight;
//
//    private OrderStatus getSavedOrderStatus() {
//        Set<OrderStatus> savedOrderStatus = this.repository.getAll();
//        return savedOrderStatus.iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = OrderStatusImplementation.getRepository();
//        this.userAccessRight = OrderStatusFactory.getOrderStatus("In-progress");
//    }
//
//    @Test
//    public void a_create() {
//        OrderStatus created = this.repository.create(this.userAccessRight);
//        System.out.println("In create, created = " + created);
//        d_getAll();
//        Assert.assertSame(created, this.userAccessRight);
//    }
//
//    @Test
//    public void b_read() {
//        OrderStatus savedOrderStatus = getSavedOrderStatus();
//        System.out.println("In read, courseId = "+ savedOrderStatus.getStatus());
//        OrderStatus read = this.repository.read(savedOrderStatus.getStatus());
//        System.out.println("In read, read = " + read);
//        d_getAll();
//        Assert.assertEquals(savedOrderStatus, read);
//    }
//
//    @Test
//    public void e_delete() {
//        OrderStatus savedOrderStatus = getSavedOrderStatus();
//        this.repository.delete(savedOrderStatus.getStatus());
//        d_getAll();
//    }
//
//    @Test
//    public void c_update() {
//        String status = "In-progress";
//        OrderStatus userAccessRght= new OrderStatus.Builder().copy(getSavedOrderStatus()).build();
//        System.out.println("In update, about_to_updated = " + userAccessRght);
//        OrderStatus updated = this.repository.update(userAccessRght);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(status, updated.getStatus());
//        d_getAll();
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<OrderStatus> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
//    }
//}

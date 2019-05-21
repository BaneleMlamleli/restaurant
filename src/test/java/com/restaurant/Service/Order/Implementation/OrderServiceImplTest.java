package com.restaurant.Service.Order.Implementation;

import com.restaurant.Domain.Order.Order;
import com.restaurant.Factory.Order.OrderFactory;
import com.restaurant.Repository.Implementation.OrderImplementation.OrderImplementation;
import com.restaurant.Repository.Order.OrderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.stereotype.Service;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderServiceImplTest {

    private OrderImplementation repository;
    private Order course;

    private Order getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (OrderImplementation) OrderImplementation.getRepository();
        this.course = OrderFactory.getOrder(2, "","", "", "", "", "", 2.1);
    }

    @Test
    public void a_create() {
        Order created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void c_update() {
        String newOrderName = "Sushi";
        Order updated = new Order.Builder().copy(getSaved()).order_name("Sushi").build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newOrderName, updated.getOrder_name());
    }

    @Test
    public void e_delete() {
        Order saved = getSaved();
        this.repository.delete(saved.getOrder_name());
        d_getAll();
    }

    @Test
    public void b_read() {
        Order saved = getSaved();
        Order read = this.repository.read(saved.getOrder_name());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Order> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}

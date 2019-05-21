/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Implementation.OrderImplementation;

import com.restaurant.Domain.Order.TakeOrder;
import com.restaurant.Domain.Order.TakeOrderTest;
import com.restaurant.Factory.Order.TakeOrderFactory;
import com.restaurant.Repository.Order.TakeOrderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 *
 * @author banelemlamleli
 */
public class TakeOrderImplementationTest {
    private TakeOrderRepository repository;
    private TakeOrder userAccessRight;

    private TakeOrder getSavedTakeOrder() {
        Set<TakeOrder> savedTakeOrder = this.repository.getAll();
        return savedTakeOrder.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TakeOrderImplementation.getRepository();
        this.userAccessRight = TakeOrderFactory.getTakeOrder(true, "Sushi");
    }

    @Test
    public void a_create() {
        TakeOrder created = this.repository.create(this.userAccessRight);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.userAccessRight);
    }

    @Test
    public void b_read() {
        TakeOrder savedTakeOrder = getSavedTakeOrder();
        System.out.println("In read, courseId = "+ savedTakeOrder.toString());
        TakeOrder read = this.repository.read(savedTakeOrder.toString());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedTakeOrder, read);
    }

    @Test
    public void e_delete() {
        TakeOrder savedTakeOrder = getSavedTakeOrder();
        this.repository.delete(savedTakeOrder.toString());
        d_getAll();
    }

    @Test
    public void c_update() {
        String title = "Manager";
        TakeOrder userAccessRght= new TakeOrder.Builder().copy(getSavedTakeOrder()).build();
        System.out.println("In update, about_to_updated = " + userAccessRght);
        TakeOrder updated = this.repository.update(userAccessRght);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(title, updated.toString());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<TakeOrder> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertSame(1, all.size());
    }
}

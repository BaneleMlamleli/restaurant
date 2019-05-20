package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.TakeOrder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TakeOrderFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        TakeOrder r = TakeOrderFactory.getTakeOrder(true, "Beef Burger");
        Assert.assertNotNull(r.toString());
        Assert.assertNotNull(r);
    }
}

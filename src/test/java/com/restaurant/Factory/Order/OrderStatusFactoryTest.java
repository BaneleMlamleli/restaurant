package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.OrderStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderStatusFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        OrderStatus r = OrderStatusFactory.getOrderStatus("In-progress");
        Assert.assertNotNull(r.getStatus());
        Assert.assertNotNull(r);
    }
}

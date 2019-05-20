package com.restaurant.Factory.Order;

import com.restaurant.Domain.Order.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        Date dt = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String order_date = formatter.format(dt);
        Order r = OrderFactory.getOrder(1, "Medium rare", "Beef Burger", "Table One", "Banele", "In-progress", order_date, 12.12);
        Assert.assertNotNull(r.getOrder_name());
        Assert.assertNotNull(r);
    }
}

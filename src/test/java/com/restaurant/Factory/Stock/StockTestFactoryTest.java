package com.restaurant.Factory.Stock;

import com.restaurant.Domain.Stock.Stock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockTestFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        Stock r = StockFactory.getStock("Cheese", 12);
        Assert.assertNotNull(r.getItemName());
        Assert.assertNotNull(r);
    }
}

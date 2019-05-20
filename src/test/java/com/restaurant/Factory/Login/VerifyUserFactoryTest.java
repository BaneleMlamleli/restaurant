package com.restaurant.Factory.Login;

import com.restaurant.Domain.Login.VerifyUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VerifyUserFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        VerifyUser r = VerifyUserFactory.getUserAccessRight("Chef", "BaneleMlamleli", "Test01");
        Assert.assertNotNull(r.getUsername());
        Assert.assertNotNull(r);
    }
}

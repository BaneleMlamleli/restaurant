package com.restaurant.Factory.Login;

import com.restaurant.Domain.Login.UserAccessRight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserAccessRightFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        UserAccessRight r = UserAccessRightFactory.getUserAccessRight("Chef","Banele");
        Assert.assertNotNull(r.getUsername());
        Assert.assertNotNull(r);
    }
}

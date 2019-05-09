package com.restaurant.Factory.Login;

import com.restaurant.Domain.Login.RegisterNewUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegisterNewUserFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        RegisterNewUser r = RegisterNewUserFactory.getRegisterUser(this.testName, "", "", "");
        Assert.assertNotNull(r.getName());
        Assert.assertNotNull(r);
    }
}

package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Domain.Login.UserAccessRightTest;
import com.restaurant.Factory.Login.UserAccessRightFactory;
import com.restaurant.Repository.Login.UserAccessRightRepository;
import com.restaurant.Repository.Login.UserAccessRightRepositoryTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserAccessRightImplementationTest {
    private UserAccessRightRepository repository;
    private UserAccessRight userAccessRight;

    private UserAccessRight getSavedUserAccessRight() {
        Set<UserAccessRight> savedUserAccessRight = (Set<UserAccessRight>)this.repository.findAll();
        return savedUserAccessRight.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
//        this.repository = UserAccessRightImplementation.getRepository();
        this.userAccessRight = UserAccessRightFactory.getUserAccessRight("", "");
    }

    @Test
    public void a_create() {
        UserAccessRight created = this.repository.save(this.userAccessRight);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.userAccessRight);
    }

    @Test
    public void b_read() {
        UserAccessRight savedUserAccessRight = getSavedUserAccessRight();
        System.out.println("In read, courseId = "+ savedUserAccessRight.getTitle());
        UserAccessRight read = this.repository.save(savedUserAccessRight);
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedUserAccessRight, read);
    }

    @Test
    public void e_delete() {
        UserAccessRight savedUserAccessRight = getSavedUserAccessRight();
        this.repository.delete(savedUserAccessRight);
        d_getAll();
    }

    @Test
    public void c_update() {
        String title = "Manager";
        UserAccessRight userAccessRght= new UserAccessRight.Builder().copy(getSavedUserAccessRight()).build();
        System.out.println("In update, about_to_updated = " + userAccessRght);
        UserAccessRight updated = this.repository.save(userAccessRght);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(title, updated.getTitle());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<UserAccessRight> all = (Set<UserAccessRight>)this.repository.findAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertSame(1, all.size());
    }
}

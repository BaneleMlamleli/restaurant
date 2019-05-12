package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Factory.Login.VerifyUserFactory;
import com.restaurant.Repository.Login.VerifyUserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class VerifyUserImplementationTest {
    private VerifyUserRepository repository;
    private VerifyUser registerNewUser;

    private VerifyUser getSavedVerifyUser() {
        Set<VerifyUser> savedVerifyUser = this.repository.getAll();
        return savedVerifyUser.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = VerifyUserImplementation.getRepository();
        this.registerNewUser = VerifyUserFactory.getUserAccessRight("", "", "");
    }

    @Test
    public void a_create() {
        VerifyUser created = this.repository.create(this.registerNewUser);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.registerNewUser);
    }

    @Test
    public void b_read() {
        VerifyUser savedVerifyUser = getSavedVerifyUser();
        System.out.println("In read, courseId = "+ savedVerifyUser.getTitle());
        VerifyUser read = this.repository.read(savedVerifyUser.getUsername());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedVerifyUser, read);
    }

    @Test
    public void e_delete() {
        VerifyUser savedVerifyUser = getSavedVerifyUser();
        this.repository.delete(savedVerifyUser.getTitle());
        d_getAll();
    }

    @Test
    public void c_update() {
//        RegisterNewUser savedRegisteredNewUser = getSavedCourse();
//        String newname = "New Test Course Name";
//        RegisterNewUser regUser = new RegisterNewUser.Builder().copy(getSavedCourse()).build();
//        System.out.println("In update, about_to_updated = " + regUser);
//        RegisterNewUser updated = this.repository.update(regUser);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getName());
//        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<VerifyUser> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}

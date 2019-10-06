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
        Set<VerifyUser> savedVerifyUser = (Set<VerifyUser>)this.repository.findAll();
        return savedVerifyUser.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
//        this.repository = VerifyUserImplementation.getRepository();
        this.registerNewUser = VerifyUserFactory.getUserAccessRight("", "", "");
    }

    @Test
    public void a_create() {
        VerifyUser created = this.repository.save(this.registerNewUser);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.registerNewUser);
    }

    @Test
    public void b_read() {
        VerifyUser savedVerifyUser = getSavedVerifyUser();
        System.out.println("In read, courseId = "+ savedVerifyUser.getTitle());
        VerifyUser read = this.repository.save(savedVerifyUser);
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedVerifyUser, read);
    }

    @Test
    public void e_delete() {
        VerifyUser savedVerifyUser = getSavedVerifyUser();
        this.repository.delete(savedVerifyUser);
        d_getAll();
    }

    @Test
    public void c_update() {
//        VerifyUser savedVerifyUser = getSavedCourse();
//        String newname = "New Test Course Name";
//        VerifyUser user = new VerifyUser.Builder().copy(getSavedCourse()).build();
//        System.out.println("In update, about_to_updated = " + user);
//        VerifyUser updated = this.repository.update(user);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(newname, updated.getTitle());
//        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<VerifyUser> all = (Set<VerifyUser>)this.repository.findAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}

package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Factory.Login.RegisterNewUserFactory;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RegisterNewUserImplementationTest{

    private RegisterNewUserRepository repository;
    private RegisterNewUser registerNewUser;

    private RegisterNewUser getSavedRegisteredNewUser() {
        Set<RegisterNewUser> savedRegisteredNewUser = (Set<RegisterNewUser>)this.repository.findAll();
        return savedRegisteredNewUser.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
//        this.repository = RegisterNewUserImplementation.getRepository();
        this.registerNewUser = RegisterNewUserFactory.getRegisterUser("", "", "", "");
    }

    @Test
    public void a_create() {
        RegisterNewUser created = this.repository.save(this.registerNewUser);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.registerNewUser);
    }

    @Test
    public void b_read() {
        RegisterNewUser savedRegisteredNewUser = getSavedRegisteredNewUser();
        System.out.println("In read, courseId = "+ savedRegisteredNewUser.getName());
        RegisterNewUser read = this.repository.save(savedRegisteredNewUser);
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedRegisteredNewUser, read);
    }

    @Test
    public void e_delete() {
        RegisterNewUser savedRegisteredNewUser = getSavedRegisteredNewUser();
        this.repository.delete(savedRegisteredNewUser);
        d_getAll();
    }

    @Test
    public void c_update() {
//        String title = "Chef";
//        String name = "Banele";
//        String surname = "Mlamleli";
//        String password = "Test01";
//        RegisterNewUser regUser = new RegisterNewUser.Builder().copy(getSavedRegisteredNewUser()).build();
//        System.out.println("In update, about_to_updated = " + regUser);
//        RegisterNewUser updated = this.repository.update(regUser);
//        System.out.println("In update, updated = " + updated);
//        Assert.assertSame(name, updated.getName());
//        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<RegisterNewUser> all = (Set<RegisterNewUser>)this.repository.findAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}

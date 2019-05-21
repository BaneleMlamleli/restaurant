package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Factory.Login.RegisterNewUserFactory;
import com.restaurant.Repository.Implementation.LoginImplementation.RegisterNewUserImplementation;
import com.restaurant.Repository.Login.RegisterNewUserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.stereotype.Service;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterNewUserServiceImplTest {

    private RegisterNewUserImplementation repository;
    private RegisterNewUser course;

    private RegisterNewUser getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (RegisterNewUserImplementation) RegisterNewUserImplementation.getRepository();
        this.course = RegisterNewUserFactory.getRegisterUser("Chef","Banele","Mlamleli", "Test01");
    }

    @Test
    public void a_create() {
        RegisterNewUser created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void c_update() {
//        String newRegisterNewUserName = "Banele Mlamleli";
//        RegisterNewUser updated = new RegisterNewUser.Builder().copy(getSaved()).courseName(newRegisterNewUserName).build();
//        System.out.println("In update, updated = " + updated);
//        this.repository.update(updated);
//        Assert.assertSame(newRegisterNewUserName, updated.getName());
    }

    @Test
    public void e_delete() {
        RegisterNewUser saved = getSaved();
        this.repository.delete(saved.getName());
        d_getAll();
    }

    @Test
    public void b_read() {
        RegisterNewUser saved = getSaved();
        RegisterNewUser read = this.repository.read(saved.getName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<RegisterNewUser> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
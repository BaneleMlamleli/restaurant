//package com.restaurant.Service.Login.Implementation;
//
//import com.restaurant.Domain.Login.UserAccessRight;
//import com.restaurant.Factory.Login.UserAccessRightFactory;
//import com.restaurant.Repository.Implementation.LoginImplementation.UserAccessRightImplementation;
//import com.restaurant.Repository.Login.UserAccessRightRepository;
//import com.restaurant.Service.Login.UserAccessRightService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class UserAccessRightServiceImplTest {
//
//    private UserAccessRightImplementation repository;
//    private UserAccessRight course;
//
//    private UserAccessRight getSaved(){
//        return this.repository.getAll().iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = (UserAccessRightImplementation) UserAccessRightImplementation.getRepository();
//        this.course = UserAccessRightFactory.getUserAccessRight("Chef", "Banele");
//    }
//
//    @Test
//    public void a_create() {
//        UserAccessRight created = this.repository.create(this.course);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.course);
//    }
//
//    @Test
//    public void c_update() {
//        String newUserAccessRightName = "Banele";
//        UserAccessRight updated = new UserAccessRight.Builder().copy(getSaved()).build();
//        System.out.println("In update, updated = " + updated);
//        this.repository.update(updated);
//        Assert.assertSame(newUserAccessRightName, updated.getUsername());
//    }
//
//    @Test
//    public void e_delete() {
//        UserAccessRight saved = getSaved();
//        this.repository.delete(saved.getUsername());
//        d_getAll();
//    }
//
//    @Test
//    public void b_read() {
//        UserAccessRight saved = getSaved();
//        UserAccessRight read = this.repository.read(saved.getUsername());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<UserAccessRight> courses = this.repository.getAll();
//        System.out.println("In getall, all = " + courses);
//    }
//}
//

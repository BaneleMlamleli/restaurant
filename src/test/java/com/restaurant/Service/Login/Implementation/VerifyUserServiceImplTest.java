//package com.restaurant.Service.Login.Implementation;
//
//import com.restaurant.Domain.Login.VerifyUser;
//import com.restaurant.Factory.Login.VerifyUserFactory;
//import com.restaurant.Repository.Implementation.LoginImplementation.VerifyUserImplementation;
//import com.restaurant.Repository.Login.VerifyUserRepository;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class VerifyUserServiceImplTest {
//
//    private VerifyUserImplementation repository;
//    private VerifyUser course;
//
//    private VerifyUser getSaved(){
//        return this.repository.getAll().iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = (VerifyUserImplementation) VerifyUserImplementation.getRepository();
//        this.course = VerifyUserFactory.getUserAccessRight("Manager", "Banele", "Test01");
//    }
//
//    @Test
//    public void a_create() {
//        VerifyUser created = this.repository.create(this.course);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.course);
//    }
//
//    @Test
//    public void c_update() {
////        String newVerifyUserName = "Banele";
////        VerifyUser updated = new VerifyUser.Builder().copy(getSaved()).courseName(newVerifyUserName).build();
////        System.out.println("In update, updated = " + updated);
////        this.repository.update(updated);
////        Assert.assertSame(newVerifyUserName, updated.getUsername());
//    }
//
//    @Test
//    public void e_delete() {
//        VerifyUser saved = getSaved();
//        this.repository.delete(saved.getUsername());
//        d_getAll();
//    }
//
//    @Test
//    public void b_read() {
//        VerifyUser saved = getSaved();
//        VerifyUser read = this.repository.read(saved.getUsername());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<VerifyUser> courses = this.repository.getAll();
//        System.out.println("In getall, all = " + courses);
//    }
//}
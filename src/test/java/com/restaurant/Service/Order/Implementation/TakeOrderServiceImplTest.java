//package com.restaurant.Service.Order.Implementation;
//
//import com.restaurant.Domain.Order.TakeOrder;
//import com.restaurant.Factory.Order.TakeOrderFactory;
//import com.restaurant.Repository.Implementation.OrderImplementation.TakeOrderImplementation;
//import com.restaurant.Repository.Order.TakeOrderRepository;
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
//public class TakeOrderServiceImplTest {
//
//    private TakeOrderImplementation repository;
//    private TakeOrder course;
//
//    private TakeOrder getSaved(){
//        return this.repository.getAll().iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = (TakeOrderImplementation) TakeOrderImplementation.getRepository();
//        this.course = TakeOrderFactory.getTakeOrder(true, "Sushi");
//    }
//
//    @Test
//    public void a_create() {
//        TakeOrder created = this.repository.create(this.course);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.course);
//    }
//
//    @Test
//    public void c_update() {
//        String newTakeOrderName = "Rice";
//        TakeOrder updated = new TakeOrder.Builder().copy(getSaved()).order_name("").build();
//        System.out.println("In update, updated = " + updated);
//        this.repository.update(updated);
//        Assert.assertSame(newTakeOrderName, updated.toString());
//    }
//
//    @Test
//    public void e_delete() {
//        TakeOrder saved = getSaved();
//        this.repository.delete(saved.toString());
//        d_getAll();
//    }
//
//    @Test
//    public void b_read() {
//        TakeOrder saved = getSaved();
//        TakeOrder read = this.repository.read(saved.toString());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<TakeOrder> courses = this.repository.getAll();
//        System.out.println("In getall, all = " + courses);
//    }
//}

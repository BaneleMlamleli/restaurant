package com.restaurant.Service.Stock;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Factory.Stock.StockFactory;
import com.restaurant.Repository.Implementation.StockImplementation.StockImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StockServiceImplTest {

    private StockImplementation repository;
    private Stock course;

    private Stock getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (StockImplementation) StockImplementation.getRepository();
        this.course = StockFactory.getStock("Sushi", 23);
    }

    @Test
    public void a_create() {
        Stock created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void c_update() {
        String newStockName = "Test";
        Stock updated = new Stock.Builder().copy(getSaved()).itemName("Sushi").build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newStockName, updated.getItemName());
    }

    @Test
    public void e_delete() {
        Stock saved = getSaved();
        this.repository.delete(saved.getItemName());
        d_getAll();
    }

    @Test
    public void b_read() {
        Stock saved = getSaved();
        Stock read = this.repository.read(saved.getItemName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Stock> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}

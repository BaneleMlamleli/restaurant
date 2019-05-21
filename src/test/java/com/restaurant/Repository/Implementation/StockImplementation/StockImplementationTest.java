/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Implementation.StockImplementation;

import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Factory.Stock.StockFactory;
import com.restaurant.Repository.Stock.StockRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 *
 * @author banelemlamleli
 */
public class StockImplementationTest {
    private StockRepository repository;
    private Stock userAccessRight;

    private Stock getSavedStock() {
        Set<Stock> savedStock = this.repository.getAll();
        return savedStock.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = StockImplementation.getRepository();
        this.userAccessRight = StockFactory.getStock("Sushi", 34);
    }

    @Test
    public void a_create() {
        Stock created = this.repository.create(this.userAccessRight);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.userAccessRight);
    }

    @Test
    public void b_read() {
        Stock savedStock = getSavedStock();
        System.out.println("In read, courseId = "+ savedStock.getItemName());
        Stock read = this.repository.read(savedStock.getItemName());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedStock, read);
    }

    @Test
    public void e_delete() {
        Stock savedStock = getSavedStock();
        this.repository.delete(savedStock.getItemName());
        d_getAll();
    }

    @Test
    public void c_update() {
        Stock savedStock = getSavedStock();
        String itemNm = "Sushi";
        Stock userAccessRght= new Stock.Builder().copy(getSavedStock()).build();
        System.out.println("In update, about_to_updated = " + userAccessRght);
        Stock updated = this.repository.update(userAccessRght);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(itemNm, updated.getItemName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Stock> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertSame(1, all.size());
    }
}

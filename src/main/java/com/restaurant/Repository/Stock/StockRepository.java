/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Stock;

/**
 *
 * @author banelemlamleli
 */
public class StockRepository {
    private String itemName;
    private int usage;
    
    public StockRepository(){
    }

    public StockRepository(String itemName, int usage) {
        this.itemName = itemName;
        this.usage = usage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "StockRepository{" + "itemName=" + itemName + ", usage=" + usage + '}';
    }
}

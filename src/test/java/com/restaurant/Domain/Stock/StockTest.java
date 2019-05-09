/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain.Stock;

/**
 *
 * @author banelemlamleli
 */
public class StockTest {
    private String itemName;
    private int usage;

    private StockTest(StockTest stockTest){

    }

    private StockTest(Builder builder){
        this.itemName = builder.itemName;
        this.usage = builder.usage;
    }

    public String getItemName() {
        return itemName;
    }

    public int getUsage() {
        return usage;
    }

    public static class Builder {
        private String itemName;
        private int usage;

        public Builder itemName(String itemName){
            this.itemName = itemName;
            return this;
        }

        public Builder usage(int usage) {
            this.usage = usage;
            return this;
        }

        public StockTest build(){
            return new StockTest(this);
        }
    }

    @Override
    public String toString() {
        return "StockImplementationTest{" + "itemName=" + itemName + ", usage=" + usage + '}';
    }
}

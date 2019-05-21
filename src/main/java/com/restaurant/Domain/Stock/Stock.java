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
public class Stock {
    private String itemName;
    private int usage;

    private Stock(Stock stock){

    }

    private Stock(Builder builder){
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

        public Stock build(){
            return new Stock(this);
        }

        public Builder copy(Stock savedStock) {
            this.itemName = savedStock.itemName;
            this.usage = savedStock.usage;
            return this;
        }
    }

    @Override
    public String toString() {
        return "StockImplementation{" + "itemName=" + itemName + ", usage=" + usage + '}';
    }
}

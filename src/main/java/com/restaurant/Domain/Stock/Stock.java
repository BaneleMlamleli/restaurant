/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain.Stock;


import javax.persistence.*;

/**
 *
 * @author banelemlamleli
 */
@Entity
@Table(name = "tblStock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private int id;
    private String itemName;
    @Column(name = "stock_usage")
    private int usage;

    private Stock(Stock stock){

    }

    private Stock(Builder builder){
        this.id = builder.id;
        this.itemName = builder.itemName;
        this.usage = builder.usage;
    }

    public int getId() {
        return id;
    }
    public String getItemName() {
        return itemName;
    }

    public int getUsage() {
        return usage;
    }

    public static class Builder {
        private int id;
        private String itemName;
        private int usage;

        public Builder id(int id){
            this.id = id;
            return this;
        }

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
            this.id = savedStock.id;
            this.itemName = savedStock.itemName;
            this.usage = savedStock.usage;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", usage=" + usage +
                '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain;

/**
 *
 * @author banelemlamleli
 */
public class TakeOrder {
    private boolean selectedRadioButtonItem;
    private String order_name;

    public TakeOrder() {
    }

    public TakeOrder(boolean selectedRadioButtonItem, String order_name) {
        this.selectedRadioButtonItem = selectedRadioButtonItem;
        this.order_name = order_name;
    }

    public boolean isSelectedRadioButtonItem() {
        return selectedRadioButtonItem;
    }

    public void setSelectedRadioButtonItem(boolean selectedRadioButtonItem) {
        this.selectedRadioButtonItem = selectedRadioButtonItem;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    @Override
    public String toString() {
        return "Order{" + "selectedRadioButtonItem=" + selectedRadioButtonItem + ", order_name=" + order_name + '}';
    }
}

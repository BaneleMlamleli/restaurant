/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Order;

/**
 *
 * @author banelemlamleli
 */
public class TakeOrderRepository {
    private boolean selectedRadioButtonItem;
    private String order_name;

    public TakeOrderRepository() {
    }

    public TakeOrderRepository(boolean selectedRadioButtonItem, String order_name) {
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
        return "OrderRepository{" + "selectedRadioButtonItem=" + selectedRadioButtonItem + ", order_name=" + order_name + '}';
    }
}

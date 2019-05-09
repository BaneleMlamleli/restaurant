/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain.Order;

/**
 *
 * @author banelemlamleli
 */
public class TakeOrderTest {
    private boolean selectedRadioButtonItem;
    private String order_name;

    private TakeOrderTest(TakeOrderTest takeOrderTest){

    }

    private TakeOrderTest(Builder builder){
        this.order_name = builder.order_name;
        this.selectedRadioButtonItem = builder.selectedRadioButtonItem;
    }



    public static class Builder {
        private boolean selectedRadioButtonItem;
        private String order_name;

        public Builder selectedRadioButtonItem(boolean selectedRadioButtonItem){
            this.selectedRadioButtonItem = selectedRadioButtonItem;
            return this;
        }

        public Builder order_name(String order_name) {
            this.order_name = order_name;
            return this;
        }

        public TakeOrderTest build(){
            return new TakeOrderTest(this);
        }
    }

    @Override
    public String toString() {
        return "OrderImplementationTest{" + "selectedRadioButtonItem=" + selectedRadioButtonItem + ", order_name=" + order_name + '}';
    }
}

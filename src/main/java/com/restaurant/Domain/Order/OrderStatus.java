package com.restaurant.Domain.Order;

public class OrderStatus {
    private String status;

    private OrderStatus(OrderStatus orderStatus){

    }

    private OrderStatus(Builder builder){
        this.status = builder.status;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {
        private String status;

        public Builder status(String status){
            this.status = status;
            return this;
        }

        public OrderStatus build(){
            return new OrderStatus(this);
        }
    }
}

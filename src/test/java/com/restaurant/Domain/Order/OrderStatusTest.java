package com.restaurant.Domain.Order;

public class OrderStatusTest {
    private String status;

    private OrderStatusTest(OrderStatusTest orderStatusTest){

    }

    private OrderStatusTest(Builder builder){
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

        public OrderStatusTest build(){
            return new OrderStatusTest(this);
        }
    }
}

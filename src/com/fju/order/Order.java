package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;
    public int total(){
        return shipFeed+amount;
    }

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed=delivery.price;
    }
}

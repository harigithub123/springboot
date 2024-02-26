package com.example.demo.designpattern.strategy;

public class UpiPayment implements PaymentStrategy {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Rs."+amount+" Payment done through upi id starting with - "
                + upiId.substring(0,4));
    }
}

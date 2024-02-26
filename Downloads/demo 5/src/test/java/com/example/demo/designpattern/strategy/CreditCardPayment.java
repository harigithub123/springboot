package com.example.demo.designpattern.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Rs."+amount+" Payment done through card number ending with - "
                + creditCardNumber.substring(creditCardNumber.length()-4));
    }
}

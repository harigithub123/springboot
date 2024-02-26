package com.example.demo.designpattern.factory;

// CreditCard implementation of the Card abstract class
public class CreditCard extends Card {
    private int creditLimit;

    public CreditCard(String cardNumber, String cardHolderName, int creditLimit) {
        super(cardNumber, cardHolderName);
        this.creditLimit = creditLimit;
    }

    @Override
    public void swipe() {
        System.out.println("Swiping Credit Card with card number: " + cardNumber
                + " belonging to " + cardHolderName
                + " with credit limit: $" + creditLimit + "...");
    }
}

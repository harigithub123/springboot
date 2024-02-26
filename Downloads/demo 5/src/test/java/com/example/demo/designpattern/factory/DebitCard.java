package com.example.demo.designpattern.factory;

// DebitCard implementation of the Card abstract class
public class DebitCard extends Card {
    public DebitCard(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public void swipe() {
        System.out.println("Swiping Debit Card with card number: " + cardNumber + " belonging to " + cardHolderName + "...");
    }
}

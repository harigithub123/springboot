package com.example.demo.designpattern.factory;

// Abstract class for the Card
abstract class Card {
    protected String cardNumber;
    protected String cardHolderName;

    public Card(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    abstract void swipe();
}


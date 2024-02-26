package com.example.demo.designpattern.abstractfactory;

public class FactoryCreator {
    AbstractFactory getFactory(String type) {
        if("Bank".equals(type)) {
            return new BankFactory();
        } else {
            return new LoanFactory();
        }
    }
}

package com.example.demo.designpattern.abstractfactory;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}

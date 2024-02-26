package com.example.demo.designpattern.abstractfactory;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loanType);

}

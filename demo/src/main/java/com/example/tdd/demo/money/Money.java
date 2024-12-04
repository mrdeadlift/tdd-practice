package com.example.tdd.demo.money;

import com.example.tdd.demo.interfaces.Expression;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    // abstract Money times(int multiplier);
    Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
    }
    // abstract String currency();

    public boolean equals(Object object){
        Money money = (Money) object;
        // return amount == money.amount && getClass().equals(money.getClass());
        return amount == money.amount && currency().equals(money.currency());
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public String currency(){
        return currency;
    }

    public String toString(){
        return amount + "" + currency;
    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to){
        // return this;
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}

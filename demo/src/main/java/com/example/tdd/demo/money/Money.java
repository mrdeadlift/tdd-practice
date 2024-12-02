package com.example.tdd.demo.money;

public class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    // abstract Money times(int multiplier);
    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }
    // abstract String currency();

    public boolean equals(Object object){
        Money money = (Money) object;
        // return amount == money.amount && getClass().equals(money.getClass());
        return amount == money.amount && currency().equals(money.currency());
    }

    public static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public String currency(){
        return currency;
    }

    public String toString(){
        return amount + "" + currency;
    }
}

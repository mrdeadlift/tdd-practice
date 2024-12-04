package com.example.tdd.demo.money;

import com.example.tdd.demo.interfaces.Expression;

public class Sum implements Expression {
    Expression augend;
    Expression addend;

    Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to){
        // int amount = augend.amount + addend.amount;
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return null;
    }
}

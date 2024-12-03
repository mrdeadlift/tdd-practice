package com.example.tdd.demo.money;

import com.example.tdd.demo.interfaces.Expression;

public class Bank {
    public Money reduce(Expression source, String to){
        // if(source instanceof Money){
        //     return ((Money) source).reduce(to);
        // }
        // Sum sum = (Sum) source;
        // int amount = sum.augend.amount + sum.addend.amount;
        // return new Money(amount, to);
        return source.reduce(to);
    }
}

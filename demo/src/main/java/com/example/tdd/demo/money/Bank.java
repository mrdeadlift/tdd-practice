package com.example.tdd.demo.money;

import java.util.HashMap;
import java.util.Map;

import com.example.tdd.demo.interfaces.Expression;
import com.example.tdd.demo.util.Pair;


public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String to){
        // if(source instanceof Money){
        //     return ((Money) source).reduce(to);
        // }
        // Sum sum = (Sum) source;
        // int amount = sum.augend.amount + sum.addend.amount;
        // return new Money(amount, to);
        return source.reduce(this, to);
    }
    
    void addRate(String from, String to, int rate){
    rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to){
        // return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
}

package com.example.tdd.demo.money;

import com.example.tdd.demo.interfaces.Expression;

public class Bank {
    public Money reduce(Expression source, String to){
        return Money.dollar(10);
    }
}

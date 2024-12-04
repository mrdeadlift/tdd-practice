package com.example.tdd.demo.interfaces;

import com.example.tdd.demo.money.Bank;
import com.example.tdd.demo.money.Money;

public interface Expression {
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}

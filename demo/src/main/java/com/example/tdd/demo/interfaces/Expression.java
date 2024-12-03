package com.example.tdd.demo.interfaces;

import com.example.tdd.demo.money.Money;

public interface Expression {
    Money reduce(String to);
}

package com.example.tdd.demo.money;

public class Dollar extends Money{
    Dollar(int amount, String currency){
        super(amount, currency);
    }
    
    // Money times(int multiplier){
    //     // return Money.dollar(amount * multiplier);
    //     return new Dollar(multiplier, currency);
    // }
}

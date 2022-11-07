package com.example.solidexample.idpbad;

import lombok.AllArgsConstructor;

// Dependency Inversion Principle
// we must use abstractions (abstract classes or interfaces) instead of concrete implementation
// high level module should not depend on low level module - should work with abstractions

@AllArgsConstructor
public class BadShoppingMall {
    // tightly coupled to concrete implementation
    // can't change easily between debit and credit cards
    private BadDebitCard badDebitCard;

    public void doPurchase(long amt) {
        badDebitCard.doTransaction(amt);
    }
}

package com.example.solidexample.ispbad;

// Interface Seggregtaion Principle
// split your interfaces to comply with SRP Single Responsibility Principle
// so that classes don't have to forcibly implement methods they don't want

public class BadPhonepe implements BadUPIPayments {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashback() {
        // not applicable
    }
}

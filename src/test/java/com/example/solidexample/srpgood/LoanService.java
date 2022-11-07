package com.example.solidexample.srpgood;

public class LoanService {

    public int getLoanInterest(String loanType) {
        if (loanType.equals("home")) {
            return 8;
        } else if (loanType.equals("car")) {
            return 10;
        } else if (loanType.equals("personal")) {
            return 12;
        }
    }
}

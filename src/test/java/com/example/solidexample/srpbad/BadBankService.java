package com.example.solidexample.srpbad;

// Single Responsibility Principle
// Class handling multiple responsibilities in one - notification, printing, etc

public class BadBankService {

    public int getLoanInterest(String loanType) {
        if (loanType.equals("home")) {
            return 8;
        } else if (loanType.equals("car")) {
            return 10;
        } else if (loanType.equals("personal")) {
            return 12;
        }
    }

    public long withdraw(long amt, String accId) {
        return 0;
    }

    public long deposit(long amt, String accId) {
        return 0;
    }

    public void printPassbook(String accId) {

    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {

        } else if (medium.equals("mobile")) {

        }
    }


}

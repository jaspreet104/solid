package com.example.solidexample.ocpbad;

// Open Closed Principle
// Class needs to be modified to cater to additional notification mechanisms.
// Should be open only to extension and not modification.

public class BadNotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {

        } else if (medium.equals("mobile")) {

        }
    }
}

package com.example.solidexample.idpgood;

public class ShoppingMall {

    private BankCard bankCard;

    public void doPurchase(long amt) {
        this.bankCard.doTransaction(amt);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchase(1000);
    }

}

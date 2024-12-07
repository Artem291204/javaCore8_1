package org.example;

public class PaymentCard {

    public int receiptMoney(int cardAccount, int moneyIncome){
        return cardAccount+moneyIncome;
    }

    public int writeOffMoney(int cardAccount, int moneyIncome){
        return cardAccount-moneyIncome;
    }

    public int taxWriteOff(int cardAccount, int tax){
        return (cardAccount*tax)/100;
    }
}

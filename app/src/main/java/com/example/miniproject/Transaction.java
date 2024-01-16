package com.example.miniproject;

public class Transaction {

    private int id;


    private String date;

    private TransactionType type;
        private double amount;

    private double balance;
        private int account;

    public Transaction(int id, String date, TransactionType type, double amount, double balance, int account) {
            this.id = id;
            this.date = date;
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.account = account;
        }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccount() {
        return account;
    }

}


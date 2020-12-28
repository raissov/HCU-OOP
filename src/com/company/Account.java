package com.company;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount){
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public int transferTo(double amount, Account another) {
        if (balance >= amount) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public String toString() {
        return String.format("Account[number=%d,balance=$%.2d]", id, balance);
    }
}

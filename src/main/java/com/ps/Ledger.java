package com.ps;


import java.util.ArrayList;
import java.util.List;


public class Ledger {
    // This is a list to store all the transactions.
    private List<Transaction> transactions;

    // This is a constructor to initialize a Ledger with an empty list of transactions.
    public Ledger() {
        transactions = new ArrayList<>();
    }

    // This is a method to add a transaction to the ledger.
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // This is a method to retrieve all the transactions from the ledger.
    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}

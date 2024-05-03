package com.ps;


import java.util.ArrayList;
import java.util.List;


public class Ledger {
    // This is a list to store all the transactions.
    private final List<String> transactions;

    // This is a constructor to initialize a Ledger with an empty list of transactions.
    public Ledger() {
        transactions = new ArrayList<>();
    }

    // This is a method to add a transaction to the ledger.
    public void addTransaction(String transactionDetails) {
        // This adds transaction details to the ledger.
        transactions.add(transactionDetails);
    }

    // This is a method to retrieve all the transactions from the ledger.
    public List<String> getAllTransactions() {
        return transactions;
    }
}

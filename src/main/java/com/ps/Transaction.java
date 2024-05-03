package com.ps;

public class Transaction {
    // These are properties inside of transaction
    public String date; // Date of transaction
    public String time; // Time of transaction
    public String description; // Description of the transaction
    public String vendor; // Vendor involved inside the transaction
    public double amount; // Time of the transaction

    // A constructor to initialize a transaction.
    public Transaction(String date, String time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    // These are all getter and setter methods for retrieving their specified needs.

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Found out a method that can be used to convert transactions.txt into a TXT string format using pipes.
    public String toTxtString() {
        return date + "|" + time + "|" + description + "|" + vendor + "|" + amount;
    }


    // Method to read the transaction as being readable for a human being.
    @Override
    public String toString() {
        return "Date: " + date + "Time:" + time + ", Description: " + description + ", Vendor: " + vendor + ", Amount: " + amount;
    }
}

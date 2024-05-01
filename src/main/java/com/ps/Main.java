package com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        // Using the ledger class to manage transactions.
        Ledger ledger = new Ledger();

        // Scanner used to read user input.
        Scanner scanner = new Scanner(System.in);

        char choice; // This declares a variable to store the user's choice.
        // Using a main do-while loop to display all the options and to handle user input.
       do {
           // Display the home menu options
           System.out.println("Welcome to the Main Menu");
           System.out.println("D) Add Deposit");
           System.out.println("P) Make Payment (Debit)");
           System.out.println("L) Ledger");
           System.out.println("X) Exit");

           System.out.print("Choose your option: ");

           // This reads the user input for choice.
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "D":


           }
       } while (!exit);
    }

    // // This calls the addDeposit method to add a deposit transaction
    public static void addDeposit(Scanner scanner, Ledger ledger) {
        // This prompts the user to enter the deposit details
        System.out.println("Please enter the details of your deposit: ");

        // This prompts the user to enter the date of the deposit.
        System.out.print("Date (yyyy-MM-dd): ");;
        String date = scanner.nextLine();

        // This prompts the user to enter the time of the deposit.
        System.out.print("Time (HH:mm:ss): ");
        String time = scanner.nextLine();

        // This prompts the user to enter the description of the deposit
        System.out.print("Description: ");
        String description = scanner.nextLine();

        // This prompts the user to enter the vendor of the deposit.
        System.out.print("Vendor: ");
        String vendor = scanner.nextLine();

        // Prompting the user to enter the amount of the deposit.
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Enters a newLine

        // This creates a new Transaction array and adds it to the ledger.
        String [] transaction = {date, time, description,vendor,String.valueOf(amount)};
        ledger.addTransaction(ledger,transaction);
    }

    // Method to display all the transactions in the ledger
    public static void displayLedger(Ledger ledger) {

            // Retrieves all the transactions from the ledger.
            List<Transaction> transactions = ledger.getAllTransactions();
    }




}
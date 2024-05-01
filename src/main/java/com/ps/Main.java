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

        /* This is a flag to control the main loop, meaning that if you fail to return a value from the function,
        the implied variable is returned instead.  */
        boolean exit = false;

        // Using a main do-while loop to display all the options and to handle user input.
       do {
           // Display the home menu options
           System.out.println("Welcome to the Main Menu");
           System.out.println("D) Add Deposit");
           System.out.println("P) Make Payment (Debit)");
           System.out.println("L) Ledger");
           System.out.println("X) Exit");
           System.out.println("Choose your option: ");

           // This reads the user input for choice.
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "D":
                    // This calls the addDeposit method to add a deposit transaction


           }
       } while (!exit);
    }

    // This is a method to add a deposit transaction.
    public static void addDeposit(Scanner scanner, Ledger ledger) {
        System.out.println("Please enter the details of your deposit: ");
        System.out.print("Date (yyyy-MM-dd): ");;
        String date = scanner.nextLine();

        System.out.print("Time (HH:mm:ss): ");
        String time = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();





    }

    // Method to display all the transactions in the ledger
    public static void displayLedger(Ledger ledger) {

            // Retrieves all the transactions from the ledger.
            List<Transaction> transactions = ledger.getAllTransactions();
    }




}
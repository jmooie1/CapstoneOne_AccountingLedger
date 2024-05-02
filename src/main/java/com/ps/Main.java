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

            System.out.print("Choose your option: "); // This prompts the user to enter a choice
            choice = scanner.next().charAt(0); // This reads the user's choice.
            switch (choice) { // This performs actions based on the user's choice.
                case 'D':
                    addDeposit(scanner, ledger); // This is an option to add a deposit.
                    break;
                case 'P':

            }
        } while (choice != 'X'); // This continues the loop until user chooses to exit.
    }

     // This calls the addDeposit method to add a deposit transaction
    public static void addDeposit(Scanner scanner, Ledger ledger) {
        System.out.println("Adding deposit.."); // This informs the user about the action

        // This prompts the user to enter the date of the deposit.
        System.out.print("Enter the date - (YYYY-MM-DD): ");
        ;
        String date = scanner.nextLine();

        // This prompts the user to enter the time of the deposit.
        System.out.print("Enter the time - (HH:MM:SS): ");
        String time = scanner.nextLine();

        // This prompts the user to enter the description of the deposit
        System.out.print("Enter the description: ");
        String description = scanner.nextLine();

        // This prompts the user to enter the vendor of the deposit.
        System.out.print("Enter the vendor name: ");
        String vendor = scanner.nextLine();

        // Prompting the user to enter the amount of the deposit.
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // This constructs the transaction details string.
        String transactionDetails = (date + " | " + time + " | " + description + " | " + vendor + " | " + amount);

        // This creates a new Transaction and adds it to the ledger.
        ledger.addTransaction(transactionDetails);

        // This informs the user about a successful addition.
        System.out.println("The deposit has been made successfully, congrats.");
    }

    // Method to display all the transactions in the ledger
    public static void displayLedger(Ledger ledger) {
        System.out.println("Displaying ledger..."); // This informs the user about the action of displaying a ledger.
        // Retrieves all the transactions from the ledger.
        List<String> transactions = ledger.getAllTransactions();
        if (transactions.isEmpty()) {
            System.out.println("None of the transactions have been recorded yet."); // This informs the user if the ledger is empty.
        } else {
            // Display transactions
            System.out.println("Transactions:");
            for (String transaction : transactions) { // This iterates through each transaction
                System.out.println(transaction); // This displays the transaction details.
            }
        }


    }
}
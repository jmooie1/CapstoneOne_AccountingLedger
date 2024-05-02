package com.ps;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Main {

   // This is a method to display the home screen options
        public static void displayHomeScreen() {
            System.out.println("Home Screen:"); // Displays header for home screen.
            System.out.println("D) Add Deposit"); // Displays option to add a deposit.
            System.out.println("P) Make Payment (Debit)"); // Displays the option to make a payment.
            System.out.println("L) Ledger"); // Displaying the option to view the ledger.
            System.out.println("X) Exit"); // Displays the option to exit the application.
        }

        public static void displayLedgerOptions() {
            System.out.println("Ledger Screen:"); // Displays the header for the ledger screen.
            System.out.println("A) All"); // Displays the option to view all the transactions.
            System.out.println("D) Deposits"); // Displays the option to view only deposits.
            System.out.println("P) Make Payment (Debit)"); // Displays the option to make a payment.
            System.out.println("R) Reports"); // Displays the option to view reports.
            System.out.println("H) Home"); // Displays the option to return to the home screen.
        }

        public static List<String> readTransactions() {
            List<String> transactions = new ArrayList<>(); // Creates a new list to store transactions.
            try (BufferedReader br = new BufferedReader(new FileReader("transactions.txt"))) { // Opens the file to read.
                String line; // Variable to store each line read from the file.
                while ((line = br.readLine()) != null) { // Reading each line until end of file
                    transactions.add(line); // Adds each transaction to the list.
                }
            } catch (IOException e) { // Handles the Exception
                e.printStackTrace(); // This prints the stack trace for the exception.
            }
            return transactions; // This returns the list of transactions.
        }

     // This calls the addDeposit method to add a deposit transaction
    public static void addDeposit(Scanner scanner, List<String> transactions) {
        System.out.println("Adding deposit.."); // This informs the user about the action

        // This prompts the user to enter the date of the deposit.
        System.out.print("Enter the date - (yyyy-MM-dd): ");
        String date = scanner.nextLine();

        // This prompts the user to enter the time of the deposit.
        System.out.print("Enter the time - (HH:mm:ss): ");
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

        // This creates deposit string.
        String deposit = (date + " | " + time + " | " + description + " | " + vendor + " | " + amount);

        // Adds deposit to the list of transactions.
        transactions.add(deposit);

        // This informs the user about a successful addition.
        System.out.println("The deposit has been made successfully, congrats.");
    }

    // Method to make a payment.
    public static void makePayment(Scanner scanner, List<String> transactions) {
        System.out.println("Enter payment info:"); // This informs the user about the action
        // Prompts the user to input transaction details.

        // This prompts the user to enter the date of the deposit.
        System.out.print("Enter the date - (yyyy-MM-dd): ");
        String date = scanner.nextLine();

        // This prompts the user to enter the time of the deposit.
        System.out.print("Enter the time - (HH:mm:ss): ");
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

        // Creates a payment string with a negative amount.
        String payment = (date + " | " + time + " | " + description + " | " + vendor + " | " + (-amount));

        // This adds a payment to the list of transactions.
        transactions.add(payment); // This is going to add a payment to the list of transactions.

        // This informs the user about a successful payment.
        System.out.println("The payment (Debit) has been made successfully!");
        }

    public static void main(String[] args) {
        // Scanner used to read user input.
        Scanner scanner = new Scanner(System.in);

        List<String> transactions = readTransactions();


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
                    makePayment(scanner,ledger); // This is the option to make a payment.
                    break;
                case 'L':
                    displayLedger(ledger); // Option to display ledger
                    break;
                default:
                    System.out.println("Invalid choice!, try again."); // Displays message for invalid input.
            }
        } while (choice != 'X'); // This continues the loop until user chooses to exit.
    }

    }

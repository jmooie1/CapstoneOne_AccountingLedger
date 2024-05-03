package com.ps;


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

    // Method to generate predefined reports.
    public static void generateReports(List<String> transactions, Scanner scanner) {
        System.out.println("Reports:"); // Displays the header for the reports.
        System.out.println("1) Month to Date"); // Displays the option for Month to Date report.
        System.out.println("2) Previous Month");  // Displays the option for Previous Month report.
        System.out.println("3) Year To Date"); // Displays the option for Year to Date report.
        System.out.println("4) Previous Year"); // Displays the option for Previous Year report.
        System.out.println("5) Search by Vendor"); // Displays the option for Search by Vendor report.
        System.out.println("0) Back"); // Displays the option to go back.

        System.out.print("Enter your choice: "); // Prompts the user to enter their choice
        int reportChoice = scanner.nextInt();

        switch (reportChoice) { // Perform actions based on the user's choice
            case 1: // Logic for Month to Date report
                break;
            case 2: // Logic for Previous Month report
                break;
            case 3: // Logic for Year to Date report
                break;
            case 4: // Logic for Previous Year report
                break;
            case 5: // Logic for Search by Vendor report
                System.out.print("Enter vendor's name: ");
                scanner.nextLine(); // Creates a newLine.
                String vendor = scanner.nextLine();
                System.out.println("Transactions for Vendor " + vendor + ":"); // Displays the header for transactions.
                for (String transaction : transactions) { // This iterates through each transaction in the list.
                    String[] parts = transaction.split("\\|"); // This splits the transaction string into parts using "|" as a delimiter
                    if (parts[3].trim().equalsIgnoreCase(vendor.trim())) { // It checks the vendor name matches the user input.
                        System.out.println(transaction);
                    }
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }


    public static void main(String[] args) {
        // Scanner used to read user input.
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for user input.

        List<String> transactions = readTransactions(); // Initializes ledger with transactions from a TXT file.
        char choice; // This declares a variable to store the user's choice.

        // Using a main do-while loop to display all the options and to handle user input.
        do {
            // Display the home menu options
            displayHomeScreen(); // Displays the home screen options.
            System.out.print("Enter your choice: "); // Prompts the user for choice.

            choice = scanner.next().charAt(0); // This reads the user's choice.
            switch (choice) { // This performs actions based on the user's choice.
                case 'D': // If user chooses to add deposit.
                    addDeposit(scanner, transactions); // This is an option to add a deposit.
                    break;
                case 'P': // If user chooses to make payment.
                    makePayment(scanner, transactions); // This is the option to make a payment.
                    break;
                case 'L': // If the user chooses to view ledger.
                    // Ledger screen loop
                    char ledgerChoice; // Variable to store user choice for ledger options.
                    do {
                        displayLedgerOptions(); // Displays the ledger options
                        System.out.print("Enter your choice: "); // Prompts the user for choice.
                        ledgerChoice = scanner.next().charAt(0); // Reading the user choice for ledger.
                        switch (ledgerChoice) {
                            case 'A': // If user chooses to view all transactions
                                System.out.print("All transactions: "); // Displays the label for all transactions.
                                for (String transaction : transactions) { // Loops through all transactions
                                    System.out.println(transaction); // Prints through each transaction.
                                }
                                break;
                            case 'D': // If user chooses to view deposits.
                                System.out.println("Deposits:"); // Displays the label for deposits.
                                for (String transaction : transactions) { // Loops through all the transactions.
                                    String[] parts = transaction.split("\\|"); // Splitting transaction string into parts.
                                    System.out.println("Transaction amount string: " + parts[4]);
                                    double amount = Double.parseDouble(parts[4]); // Parses the amount from transactions.
                                    if (amount > 0) { // If amount is positive (deposit)
                                        System.out.println(transaction); // Prints the deposit transaction.
                                    }
                                }
                                break;
                            case 'P': // If user chooses to view payments (debits)
                                System.out.println("Payments (Debits):"); // Displaying label for payments
                                for (String transaction : transactions) { // Looping through all transactions
                                    String[] parts = transaction.split("\\|"); // Splitting transaction string into parts
                                    double amount = Double.parseDouble(parts[4]); // Parses the amount from transaction
                                    if (amount < 0) { // If amount is negative (payment)
                                        System.out.println(transaction); // Prints the payment transaction.
                                    }
                                }
                                break;
                            case 'R': // If user chooses to view the reports
                                generateReports(transactions, scanner);// Option to generate the reports.
                                break;
                            case 'H': // If user chooses to go back to the home screen.
                                break;
                            default:
                                System.out.println("Invalid choice!, try again."); // Displays message for invalid input.
                        }
                    } while (ledgerChoice != 'H'); // This continues the loop until user chooses to go back to home screen.
                    break;
                case 'X': // If user chooses to exit the app.
                    System.out.println("Exiting the application..."); // Displays the exit message.
                    break;
                default:
                    System.out.println("Invalid. Try again."); // If the user enters invalid choice.
            }
        } while (choice != 'X'); // Loop until the user chooses to exit.

        scanner.close(); // Closes the scanner object.
    }
}
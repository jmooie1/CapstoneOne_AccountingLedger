# Financial Transaction Tracker

## Description -

The Financial Transaction Tracker is a CLI application that is designed to help users track their financial transactions for their personal or business
use. This application also allows users to record deposits, payments(debits), view transaction histories, generate reports, and perform searches based 
the criteria that the user puts down.

## Features -
	Add Deposit: This records the deposit teansactions including the date, time, description, vendor, and amount. 
 	Make Payment (Debit): This records the payment transactions and includes the date, time, description, vendor and amount.
	View Ledger: This displays the transaction history with the options to view all of the transations, deposits only, or payments only.
 	Reports: This generates already pre-defined reports such as Month to Date, Previous Month, Year to Date, and Previous Year. There is also an option for a custom search by vendor.
	User-Friendly Interface: It has a simple command line interface for users to easily interact with it.

 ## How to run the program - 
 	1. You must run the application.
	2. The user must choose from the home screen to add deposits, make payments, view ledger, or exit.
	3. The user must now follow the promps to input transaction details or select options.
 	4. Then the user views reports to analyze financial data. 

 ## Interesting piece of code that I wrote -
	
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
                scanner.nextLine(); // Creates a newLine
                String vendor = scanner.nextLine();
                System.out.println("Transactions for Vendor " + vendor + ":");
                for (String transaction : transactions) {
                    String[] parts = transaction.split("\\|");
                    if (parts[3].trim().equalsIgnoreCase(vendor.trim())) {
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


 
 	
	





 

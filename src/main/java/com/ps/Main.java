package com.ps;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
public static void main(String[] args) {
    // File name to save all the transactions.
    String FILE_NAME = "transactions.txt";
    // Used SimpleDateFormat as a class which is used to format.
    SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd | HH:mm:ss");

    // Scanner used to read user input.
    Scanner scanner = new Scanner(System.in);

    // Using the ledger class to manage transactions.
    Ledger ledger = new Ledger();

    // Use a main loop to display all the options and to handle user input.
    while(true) {
        System.out.println();
    }

    }
}
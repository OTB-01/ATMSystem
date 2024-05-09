/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.util.Scanner;


// MVC Pattern: View
// ATMView class handles the user interface and displays information
class ATMView {
    public void displayMenu() {
        System.out.println("---- ATM Menu ----");
        System.out.println("1. Balance Inquiry");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("------------------");
    }

    public TransactionType getUserInputTransactionType() {
        System.out.print("Enter transaction type: ");
        Scanner scanner = new Scanner(System.in);
int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return TransactionType.BALANCE_INQUIRY;
            case 2:
                return TransactionType.DEPOSIT;
            case 3:
                return TransactionType.WITHDRAWAL;
            default:
                throw new IllegalArgumentException("Invalid transaction type.");
        }
    }

    public double getUserInputAmount() {
        System.out.print("Enter amount: ");
       Scanner scanner = new Scanner(System.in);
       return scanner.nextDouble();
    }

    public void showTransactionSuccessMessage() {
        System.out.println("Transaction completed successfully.");
    }
}

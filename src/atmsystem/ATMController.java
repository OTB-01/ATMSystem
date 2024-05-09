/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

// MVC Pattern: Controller
// ATMController class handles user interactions and coordinates with the Model and View
class ATMController {

    private BankAccount currentAccount; // Update the variable type to BankAccount
    private ATMView view;

    public ATMController(BankAccount account, ATMView view) { // Update the parameter type to BankAccount
        this.currentAccount = account;
        this.view = view;
    }

    public void handleTransaction(TransactionType type) {
        double amount;
        switch (type) {
            case BALANCE_INQUIRY:
                currentAccount.performTransaction(type, 0);
                break;
            case DEPOSIT:
                amount = view.getUserInputAmount();
                currentAccount.performTransaction(type, amount);
                break;
            case WITHDRAWAL:
                amount = view.getUserInputAmount();
                currentAccount.performTransaction(type, amount);
                break;
        }
        view.showTransactionSuccessMessage();
    }

    public void run() {
        view.displayMenu();
        TransactionType transactionType = view.getUserInputTransactionType();
        handleTransaction(transactionType);
    }
}

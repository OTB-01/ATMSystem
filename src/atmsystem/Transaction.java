/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

// Behavioral Pattern: Observer

import java.util.ArrayList;
import java.util.List;

// Transaction class represents a transaction with a specific type and amount
abstract class Transaction {
    protected Account account;
    protected double amount;
    private List<TransactionObserver> observers;

    public Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
        this.observers = new ArrayList<>();
    }

    // Attach an observer to the transaction
    public void attach(TransactionObserver observer) {
        observers.add(observer);
    }

    // Detach an observer from the transaction
    public void detach(TransactionObserver observer) {
        observers.remove(observer);
    }

    // Notify all observers about the transaction
    public void notifyObservers() {
        for (TransactionObserver observer : observers) {
            observer.update(this);
        }
    }

    public abstract void execute();

    public abstract String getTransactionDetails();
}

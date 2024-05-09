/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;


class Deposit extends Transaction {
    public Deposit(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
        notifyObservers();
    }

    @Override
    public String getTransactionDetails() {
        return "Deposit: $" + amount;
    }
}
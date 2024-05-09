/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

class BankTransactionObserver implements TransactionObserver {
    // Observer implementation...
    public void update(Transaction transaction) {
         System.out.println("Received transaction update: " + transaction.getTransactionDetails());
    }
    
}
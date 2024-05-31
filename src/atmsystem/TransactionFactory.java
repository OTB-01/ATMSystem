/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;


// Creational Pattern: Factory Method
// TransactionFactory class creates instances of different transaction types
class TransactionFactory {
    public static Transaction createTransaction(TransactionType type, Account account, double amount) {
        switch (type) {
            case BALANCE_INQUIRY:
                return new BalanceInquiry(account,amount);
            case DEPOSIT:
                return new Deposit(account, amount);
            case WITHDRAWAL:
                return new Withdrawal(account, amount);
            default:
                throw new IllegalArgumentException("Invalid transaction type");
        }
    }
}

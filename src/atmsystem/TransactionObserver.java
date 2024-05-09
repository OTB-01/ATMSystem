/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;
// Behavioral Pattern: Observer
// Observer interface for external systems interested in transaction notifications
interface TransactionObserver {
    void update(Transaction transaction);
}


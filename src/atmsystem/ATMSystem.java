/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;
// Model-View-Controller (MVC) ATM system
public class ATMSystem {
    public static void main(String[] args) {
        // Create accounts and set up account hierarchy
        BankAccount individualAccount = new BankAccount("123456", 1000.0);
        Account groupAccount = new GroupAccount("Group 1");
        ((GroupAccount) groupAccount).addAccount(individualAccount);

        // Create ATM components
        ATMView view = new ATMView();
        ATMController controller = new ATMController(individualAccount, view);

        // Run the ATM system
        controller.run();
    }
}
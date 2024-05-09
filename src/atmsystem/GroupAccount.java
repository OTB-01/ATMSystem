/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.util.ArrayList;
import java.util.List;

public class GroupAccount implements Account {
    private String groupName;
    private List<Account> accounts;

    public GroupAccount(String groupName) {
        this.groupName = groupName;
        this.accounts = new ArrayList<>();
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Group Name: " + groupName);
        System.out.println("Accounts:");

        for (Account account : accounts) {
            account.displayAccountInfo();
        }
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void withdraw(double amount) {
        //
    }
}
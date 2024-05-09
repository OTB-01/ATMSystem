
package atmsystem;

class IndividualAccount implements Account {
    private String accountNumber;
    private double balance;

    public IndividualAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
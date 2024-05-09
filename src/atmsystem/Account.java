
package atmsystem;


// Structural Pattern: Composite
// Account hierarchy represented using the Composite pattern
interface Account {
    void displayAccountInfo();

    public void deposit(double amount);

    public void withdraw(double amount);
}


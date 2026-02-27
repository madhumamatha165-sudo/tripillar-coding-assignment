class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 5000);
        b.deposit(1000);
        b.withdraw(2000);
        b.display();
    }
}

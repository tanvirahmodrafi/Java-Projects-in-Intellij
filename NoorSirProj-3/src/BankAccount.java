public class BankAccount {
    int accountNumber;
    int balance;
    double interestRate;
    BankAccount(int accountNumber, int balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }else{
            balance -= amount;
        }
    }

}

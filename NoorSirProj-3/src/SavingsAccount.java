public class SavingsAccount extends BankAccount {
    String accountHoldersName;
    SavingsAccount(int accountNumber, int balance, double interestRate, String accountHoldersName) {
        super(accountNumber, balance, interestRate);
        this.accountHoldersName = accountHoldersName;
    }

    @Override
    void withdraw(int amount) {
        if (amount < balance) {
            super.withdraw(amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void deposit(int amount) {
        super.deposit(amount);
    }
    void calculateInterest() {
        System.out.println("Interest Rate: " + interestRate);
    }
}

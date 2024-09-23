public class FixedDepositAmount extends BankAccount {
    String accountHolderName;
    FixedDepositAmount(int accountNumber, int balance, double interestRate, String accountHolderName) {
        super(accountNumber, balance, interestRate);
        this.accountHolderName = accountHolderName;
    }

    @Override
    void withdraw(int amount) {
        System.out.println("Withdrawing not possible '\n' Do you want to break this account ?");
    }
    void deposit(int amount) {
        System.out.println("Deposit not possible '\n' Only one time deposit");
    }
    void calculateInterest() {
        System.out.println("Interest Rate: " + interestRate);
    }
}

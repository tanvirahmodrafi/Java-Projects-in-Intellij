public class DpsAccount extends BankAccount {
    String accountHoldersName;
    int DpsAmount;
    DpsAccount(int accountNumber, int balance,double interestRate,String name,int DpsAmount) {
        super(accountNumber, balance, interestRate);
        accountHoldersName = name;
        this.DpsAmount = DpsAmount;
    }

    @Override
    void withdraw(int amount) {
        System.out.println("Withdrawing is not possible in DPS account");
    }
    void deposit(int amount) {
        if(amount != DpsAmount){
            System.out.println("The amount of DPS account is wrong");
        }else{
            DpsAmount += amount;
        }
    }
    void calculateInterest() {
        System.out.println("Interest Rate: " + interestRate);
    }
}

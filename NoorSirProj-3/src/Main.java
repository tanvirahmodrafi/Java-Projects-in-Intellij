//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SavingsAccount Savings = new SavingsAccount(10239845,1000,4.00,"Rithi Ahmed");
        System.out.println(Savings.accountHoldersName);
        Savings.deposit(2000);
        Savings.withdraw(3000);
        Savings.calculateInterest();

        DpsAccount Dps = new DpsAccount(1032435,0,5.6,"Rithi Ahmed",2000);
        System.out.println(Dps.accountHoldersName);
        Dps.deposit(2000);
        Dps.withdraw(3000);
        Dps.calculateInterest();

        FixedDepositAmount FD = new FixedDepositAmount(10132534,500000,6.00,"Rithi Ahmed");
        System.out.println(FD.accountHolderName);
        FD.deposit(2000);
        FD.withdraw(3000);
        FD.calculateInterest();
    }
}
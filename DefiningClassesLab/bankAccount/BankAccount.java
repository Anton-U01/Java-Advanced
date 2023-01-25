package DefiningClassesLab.bankAccount;

public class BankAccount {
    private int id;
    private double balance;
    private static double interestRate = 0.02;
    private static int counter = 0;

    public int getId() {
        return id;
    }

    public BankAccount(){
        counter++;
        this.id = counter;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return interestRate * years * this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
}

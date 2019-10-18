package bank.domain;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double initBalance, double interestRate) {
        this.balance = initBalance;
        this.interestRate = interestRate;
    }

    public void addInterestRate(){
        this.balance = this.balance+this.balance*interestRate/100;
    }
}

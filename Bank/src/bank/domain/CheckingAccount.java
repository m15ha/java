package bank.domain;

public class CheckingAccount extends Account{

    private double overDraftAmount;

    public CheckingAccount(double initBalance, double overDraftAmount) {
        this.balance = initBalance;
        this.overDraftAmount = overDraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    public boolean withDraw(double amt) {
       if (amt<=balance+overDraftAmount){
           balance = balance-amt;
           return true;
       }
       return false;
    }
}

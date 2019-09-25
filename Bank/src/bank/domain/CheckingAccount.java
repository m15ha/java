package bank.domain;

public class CheckingAccount extends Account{

    private double overDraftAmount;

    protected CheckingAccount(double initBalance, double overDraftAmount) {
        super(initBalance);
        this.overDraftAmount = overDraftAmount;
    }
}

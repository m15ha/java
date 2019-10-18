package bank.domain;

public class TestAccount {
    public static void main(String[] args) throws Exception {

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingAccount johnSavings = new SavingAccount(1000, 5);
        CheckingAccount johnChecking = new CheckingAccount(5000, 3);
        CheckingAccount janeChecking = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnChecking);
        secondCustomer.addAccount(janeChecking);

        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);
        System.out.println(Bank.getCustomer(0));

        Bank.getCustomer(0).getAccaunt(0).deposit(1000);
        Bank.getCustomer(0).getAccaunt(1).withdraw(400);
        ((SavingAccount) Bank.getCustomer(0).getAccaunt(0)).addInterestRate();

        System.out.println(Bank.getCustomer(0).getAccaunt(0).getBalance());


    }
}

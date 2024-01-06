public class SavingsAccount extends BankAccount{
    //Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
    // Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

    public SavingsAccount(int accountNumber, double Balance){
        super(accountNumber, Balance);
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123, 500);

        // Deposit $1000 into account 123
        System.out.println("Deposit $1000 into account 123:");
        bankAccount.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + bankAccount.getBalance());

        // Withdraw $600 from account 123
        System.out.println("Withdraw $600 from account 123:");
        bankAccount.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(124, 1000);

        savingsAccount.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + savingsAccount.getBalance());


    }

}

public class BankAccount {
    //Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
    // Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

    private int accountNUmber;
    private double Balance;

    public  BankAccount(int accountNumber, double Balance){
        this.accountNUmber = accountNumber;
        this.Balance = Balance;
    }

    public int getAccountNUmber() {
        return accountNUmber;
    }

    public double getBalance() {
        return Balance;
    }

    public double setBalance(){
        return Balance;
    }

    public double deposit(double amount){

        return Balance += amount;
    }

    public void withdraw(double amount){

        if(Balance > amount){
            Balance -= amount;
        }else {
            System.out.println("insufficient funds");
        }

    }
}

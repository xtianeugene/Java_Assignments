import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

}
class SavingsAccount extends BankAccount{
        void addInterest(){
        double new_balance = balance * 0.05;
        balance = balance + new_balance;
        }
    }

public class BankAccountManager{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount();

        System.out.println("Enter deposit amount: ");
        double amount = input.nextDouble();
        savings.deposit(amount);

        System.out.println("Balance after depositing: "+savings.balance);

        savings.addInterest();

        System.out.println("Final balance: $" + savings.balance);

        input.close();
    }
}


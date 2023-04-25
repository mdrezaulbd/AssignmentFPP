package assignment12.problem2;


import java.util.Scanner;


public class CustomerAccount {

    private String Cus_name;
    private String Acc_No;
    private double Balance;


    public CustomerAccount(String Cus_name, String Acc_No, double Balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }


    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        this.Balance += amount;
        return true;
    }


    public boolean withdraw(double amount) throws InsufficientBalanceException, MinimumBalanceException {
        if (this.Balance - amount < 0) {
            throw new InsufficientBalanceException();
        }
        if (this.Balance - amount < 100) {
            throw new MinimumBalanceException();
        }
        this.Balance -= amount;
        return true;
    }


    public double getBalance() {
        return this.Balance;
    }


    public static void main(String[] args) {

        CustomerAccount customer = new CustomerAccount("John Doe", "1234567890", 500);


        Scanner input = new Scanner(System.in);


        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();


        if (customer.deposit(depositAmount)) {
            System.out.println("Deposit successful. New balance: " + customer.getBalance());
        } else {
            System.out.println("Invalid input. Deposit unsuccessful.");
        }


        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = input.nextDouble();


        try {
            if (customer.withdraw(withdrawAmount)) {
                System.out.println("Withdrawal successful. New balance: " + customer.getBalance());
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal unsuccessful. Insufficient balance.");
        } catch (MinimumBalanceException e) {
            System.out.println("Withdrawal unsuccessful. Minimum balance limit reached.");
        }
    }
}


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance in account.");
    }
}


class MinimumBalanceException extends Exception {
    public MinimumBalanceException() {
        super("Minimum balance limit reached.");
    }
}

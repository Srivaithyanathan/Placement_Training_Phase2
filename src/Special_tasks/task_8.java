package Special_tasks;

class Account9 {

    private double balance;

    Account9(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance = balance - amount;

            System.out.println("Amount Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }
}

public class task_8 {

    public static void main(String[] args) {

        Account9 acc = new Account9(30000);

        acc.withdraw(8000);

        // Negative withdrawal
        acc.withdraw(-500);

        // Greater than balance
        acc.withdraw(50000);
    }
}

package Special_tasks;
class Account8 {

    private double balance;

    Account8(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            balance = balance + amount;
            System.out.println("Amount Deposited: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        }
    }
}

public class task_7 {

    public static void main(String[] args) {

        Account8 acc = new Account8(25000);

        System.out.println("Initial Balance: Rs.25000");

        acc.deposit(5000);

        // Testing invalid deposit
        acc.deposit(-1000);
    }
}

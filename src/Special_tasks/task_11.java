package Special_tasks;

class BankAccount {

    static String bankName = "Mariamman Indian Bank";

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    BankAccount(long accountNumber, String accountHolderName,
                long mobileNumber, String accountType,
                double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance = balance + amount;
            System.out.println("Deposited: Rs." + amount);
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        }
    }

    public void displayAccountDetails() {

        System.out.println("\n====================================");
        System.out.println("       " + bankName);
        System.out.println("====================================");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}

public class task_11 {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        account1.displayAccountDetails();

        account1.deposit(5000);

        System.out.println("Updated Balance: Rs."
                + account1.getBalance());

        account1.withdraw(3000);

        System.out.println("Updated Balance: Rs."
                + account1.getBalance());

        account1.setMobileNumber(9999999999L);

        System.out.println("Updated Mobile Number: "
                + account1.getMobileNumber());

        account1.deposit(-500);

        account1.withdraw(-1000);

        account1.withdraw(100000);

        BankAccount account2 = new BankAccount(
                1002,
                "Kumar",
                9876501234L,
                "Current",
                50000
        );

        account2.displayAccountDetails();

        account2.deposit(10000);

        account2.withdraw(5000);

        account2.displayAccountDetails();
    }
}

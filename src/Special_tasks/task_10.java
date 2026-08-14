package Special_tasks;

class Account11 {

    static String bankName = "Mariamman Indian Bank";

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Account11(long accountNumber, String accountHolderName,
              long mobileNumber, String accountType,
              double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void display() {

        System.out.println("Bank Name      : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
        System.out.println();
    }
}

public class task_10 {

    public static void main(String[] args) {

        Account11 account1 = new Account11(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        Account11 account2 = new Account11(
                1002,
                "Kumar",
                9876501234L,
                "Current",
                50000
        );

        account1.display();
        account2.display();
    }
}

package Special_tasks;

class Account10 {

    static String bankName = "Mariamman Indian Bank";

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Account10(long accountNumber, String accountHolderName,
              long mobileNumber, String accountType,
              double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void displayAccountDetails() {

        System.out.println("====================================");
        System.out.println("       " + bankName);
        System.out.println("====================================");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}

public class task_9 {

    public static void main(String[] args) {

        Account10 acc = new Account10(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        acc.displayAccountDetails();
    }
}

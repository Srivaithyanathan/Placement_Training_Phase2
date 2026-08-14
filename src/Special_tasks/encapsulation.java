package Special_tasks;

class Account7 {

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Account7(long accountNumber, String accountHolderName,
             long mobileNumber, String accountType, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}

public class encapsulation {

    public static void main(String[] args) {

        Account7 account = new Account7(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        System.out.println("Before Mobile Number Update:");
        account.display();

        account.setMobileNumber(9999999999L);

        System.out.println("\nAfter Mobile Number Update:");
        account.display();

        System.out.println("\nMobile Number: "
                + account.getMobileNumber());
    }
}
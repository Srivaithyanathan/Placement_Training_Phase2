package Special_tasks;

class Account5 {
    private long acc_no;
    private String acc_name;
    private long mob_no;
    private String acc_type;
    private int balance;

    Account5(long acc_no, String acc_name, long mob_no,
             String acc_type, int balance) {

        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.mob_no = mob_no;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    // Getters
    public long getAccountNumber() {
        return acc_no;
    }

    public String getAccountHolderName() {
        return acc_name;
    }

    public long getMobileNumber() {
        return mob_no;
    }

    public String getAccountType() {
        return acc_type;
    }

    public int getBalance() {
        return balance;
    }
}

public class task_5 {

    public static void main(String[] args) {

        Account5 acc = new Account5(
                1872738344747L,
                "Sri",
                8792137383L,
                "Savings",
                12000
        );

        System.out.println("Account Number : " + acc.getAccountNumber());
        System.out.println("Account Name   : " + acc.getAccountHolderName());
        System.out.println("Mobile Number  : " + acc.getMobileNumber());
        System.out.println("Account Type   : " + acc.getAccountType());
        System.out.println("Balance        : " + acc.getBalance());
    }
}
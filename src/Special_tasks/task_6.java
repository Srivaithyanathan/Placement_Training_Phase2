package Special_tasks;
class Account6 {

    private long acc_no;
    private String acc_name;
    private long mob_no;
    private String acc_type;
    private int balance;

    Account6(long acc_no, String acc_name, long mob_no,
             String acc_type, int balance) {

        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.mob_no = mob_no;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    public long getMobileNumber() {
        return mob_no;
    }

    // Setter only for mobile number
    public void setMobileNumber(long mob_no) {
        this.mob_no = mob_no;
    }
}

public class task_6 {

    public static void main(String[] args) {

        Account6 acc = new Account6(
                1001,
                "Sri",
                9876543210L,
                "Savings",
                25000
        );

        System.out.println("Old Mobile Number: "
                + acc.getMobileNumber());

        acc.setMobileNumber(9999999999L);

        System.out.println("New Mobile Number: "
                + acc.getMobileNumber());
    }
}

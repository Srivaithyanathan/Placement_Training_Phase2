package Special_tasks;
import java.util.*;
class Account{
	private long acc_no;
	private String acc_name;
	long mob_no;
	String acc_type;
	int balance;
	Account(long acc_no,String acc_name,long mob_no,String acc_type,int balance){
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.mob_no=mob_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	void display() {
		System.out.println(acc_no+" "+acc_name+" "+mob_no+" "+acc_type+" "+balance);
	}
}
public class Bank_information {

	public static void main(String[] args) {
		Account acc=new Account(1872738344747L,"Sri",8792137383L,"Savings",12000);
		acc.display();
		Account bcc=new Account(1872738344747L,"SVaithi",8792137383L,"Current",12000);
		bcc.display();
		
	}

}

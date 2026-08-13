package Phase2_training;
import java.util.*;
abstract class BankAccount{
	int savings=15000;
	int current=0;
	void deposit(int amt) {
		System.out.println("Amount deposited "+amt);
		current+=amt;
	}
	void deposit(int amt,String description) {
		System.out.println("Amt deposited for "+description+": "+amt);
		current+=amt;
	}
	void deposit(int amt,String des,int id_no) {
		System.out.println("Amt deposited in "+des+" at id: "+id_no);
		current+=amt;
	}
	abstract void interest_calculation(int percent);
}
class savings extends BankAccount{
	@Override
	void interest_calculation(int percent) {
		System.out.println("Interest for savings: "+(savings*percent)/100);
	}
}
class current extends BankAccount{
	@Override
	void interest_calculation(int percent) {
		System.out.println("Interest for current: "+(current*percent)/100);
	}
}

public class bank_details {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		savings b=new savings();
		b.deposit(amt);
		b.deposit(amt,"donation");
		b.deposit(amt,"Thoothukudi branch",10019);
		b.interest_calculation(2);
		current c=new current();
		c.deposit(amt);
		b.deposit(amt,"donation");
		b.deposit(amt,"Thoothukudi branch",10019);
		c.interest_calculation(6);
	}

}

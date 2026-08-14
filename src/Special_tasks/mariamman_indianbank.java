package Special_tasks;
import java.util.*;
class Bank{
	static String bank_name="Mariamman Indian Bank";
	String cus_name;
	long acc_no;
	void acc_1(String cus_name,long acc_no) {
		System.out.println(bank_name+" "+cus_name+" "+acc_no);
	}
	void acc_2(String cus_name,long acc_no) {
		System.out.println(bank_name+" "+cus_name+" "+acc_no);
	}
}

public class mariamman_indianbank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		b.acc_1("Sri",10028);
		b.acc_2("Lonewolf",12908);
	}

}

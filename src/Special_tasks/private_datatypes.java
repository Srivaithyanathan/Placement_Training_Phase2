package Special_tasks;
class Account1{
	private long acc_no;
	private String acc_name;
	private long mob_no;
	private String acc_type;
	private int balance;
	Account1(long acc_no,String acc_name,long mob_no,String acc_type,int balance){
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.mob_no=mob_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	public String getname(String acc_name) {
		return acc_name;
	}
	public int getbalance(int balance) {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	
	public void setname(String acc_name) {
		this.acc_name=acc_name;
	}
	void display() {
		System.out.println(acc_no+" "+acc_name+" "+mob_no+" "+acc_type+" "+balance);
	}
}

public class private_datatypes {

	public static void main(String[] args) {
		Account1 acc=new Account1(1872738344747L,"Sri",8792137383L,"Savings",12000);
		acc.display();
		acc.setname("Vaithi");
		acc.setbalance(10000);
		acc.display();
		
	}

}

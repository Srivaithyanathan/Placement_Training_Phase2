package Mariamman_store1;
class InvalidPriceException extends ArithmeticException{
	InvalidPriceException(String err) {
		super(err);
	}
}
abstract class Product{
	private long Product_ID;
	private String productName;
	private double price;
	Product(long Product_ID,String productName,double price){
		if(price<=0) {
			throw new InvalidPriceException("Invalid Price..give price>0");
		}
		this.Product_ID=Product_ID;
		this.productName=productName;
		this.price=price;
	}
	public long getid() {
		return Product_ID;
	}
	public void setid(long Product_ID) {
		this.Product_ID=Product_ID;
	}
	public String getname() {
		return productName;
	}
	public void setName(String productName) {
		this.productName=productName;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		if(price<=0) {
			throw new InvalidPriceException("Invalid Price..give price>0");
		}
		this.price=price;
	}
	abstract void calDisc();
}
class Electronics extends Product{
	Electronics(long Product_ID,String productName,double price){
		super(Product_ID,productName,price);
	}
	
	@Override
	void calDisc() {
		System.out.println(getid()+" "+getname()+" "+getprice());
		System.out.println("The discount is :"+(getprice()*10)/100);
	}
	public void finalprice(){
		System.out.println("The final price: "+(getprice()-(getprice()*10)/100));
	}
	
}
class Clothing extends Product{
	Clothing(long Product_ID,String productName,double price){
		super(Product_ID,productName,price);
	}
	@Override
	void calDisc() {
		System.out.println(getid()+" "+getname()+" "+getprice());
		System.out.println("The discount is :"+(getprice()*20)/100);
	}
	public void finalprice(){
		System.out.println("The final price: "+(getprice()-(getprice()*20)/100));
	}
	
}

public class Mariamman_Online_stores {

	public static void main(String[] args) {
		try {
		Electronics e=new Electronics(10028,"Mobile phone",-12000);
		e.calDisc();
		e.finalprice();}
		catch(InvalidPriceException e){
			System.out.println(e.getMessage());			
		}
	
		try {
		Clothing c=new Clothing(12874,"T-shirts",-2000);
		c.calDisc();
		c.finalprice();
		}
		catch(InvalidPriceException e){
			System.out.println(e.getMessage());
		
		}
	
	}

}

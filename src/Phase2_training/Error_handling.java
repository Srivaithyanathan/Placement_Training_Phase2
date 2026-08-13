package Phase2_training;
import java.util.*;
public class Error_handling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c="Hello World";
		String d=null;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero error");
		}
		try {
			System.out.println(c.charAt(19));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Out of bounds");
		}
		try {
			System.out.println(d.charAt(2));
		}	
		catch(NullPointerException e) {
			System.out.println("Null pointer");
		}
	}
}

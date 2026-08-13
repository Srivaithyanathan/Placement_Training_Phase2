package Phase2_training;
import java.util.*;
public class throw_exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=90 && marks<=100) {
			System.out.println("O grade");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("A grade");
		}
		else if(marks>=69 && marks<=79) {
			System.out.println("B grade");
		}
		else if(marks>=50 && marks<=68) {
			System.out.println("C grade");
		}
		else if(marks<=49 && marks>0) {
			System.out.println("Fail");
		}
		else {
			throw new ArithmeticException("Undefined value");
		}
		
	}

}

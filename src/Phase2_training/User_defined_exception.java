package Phase2_training;
import java.util.*;
class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String err) {
		super(err);
	}
}
class CustomException{
	static void age_validation(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Invalid age");
		}
		else {
			System.out.println("Valid age");
		}
	}
}
public class User_defined_exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			CustomException.age_validation(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of the program");
		
	}}

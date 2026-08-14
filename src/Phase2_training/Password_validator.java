package Phase2_training;
import java.util.*;
class InvalidPasswordException extends ArithmeticException{
	public InvalidPasswordException(String err) {
		super(err);
	}
	
}
class Password{
	void passcheck(String str) throws InvalidPasswordException{
		if(str.length()<8) {
			throw new InvalidPasswordException("Less than 8 charaters");
		}
		else {
			System.out.println("Strong ps as you :)");
		}
	}
}
public class Password_validator {

	public static void main(String[] args) {	
		Password pass=new Password();
		try(Scanner sc=new Scanner(System.in);){
			String str=sc.next();
			pass.passcheck(str);
		}
		catch(InvalidPasswordException e){
			System.out.println(e.getMessage());
		}
	}
}

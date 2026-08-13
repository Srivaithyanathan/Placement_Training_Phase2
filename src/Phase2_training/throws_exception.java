package Phase2_training;
class parent{
	void division(int a, int b) throws ArithmeticException{
		System.out.println(a/b);
	}
}
public class throws_exception {

	public static void main(String[] args) {
		parent p=new parent();
		try {
			p.division(10, 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		
	}

}

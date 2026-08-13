package Phase2_training;
import java.util.*;
class area{
	void area() {
		System.out.println("Area of shapes");
	}
	void area(int a) {
		System.out.println("Square: "+a*a);
	}
	void area(int a,int b) {
		System.out.println("Rec: "+a*b);
	}
	void area(double a,int b,int c) {
		System.out.println("Triangle: "+a*b*c);
	}
	void area(double a) {
		System.out.println("Circle: "+Math.PI*a*a);
	}
}
public class class_obj {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		area t=new area();
		t.area();
		t.area(12);
		t.area(12,3);
		t.area(12.5,2,3);
		t.area(12.5);
	}

}

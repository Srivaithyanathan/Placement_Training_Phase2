package Phase2_training;
import java.util.*;
class BelowZeroException extends ArithmeticException{
	public BelowZeroException(String err) {
		super(err);
	}
}
class AboveHundredException extends ArithmeticException{
	public AboveHundredException(String err) {
		super(err);
	}
}
class UserdefinedException{
	void belowzero(int[]nums) throws BelowZeroException{
		for(int num:nums) {
			if(num<0) {
				throw new BelowZeroException(num+" Below Zero");
			}
		}
	}
	void abovehundred(int[]nums) throws AboveHundredException{
		for(int num:nums) {
			if(num>100) {
				throw new AboveHundredException(num+" Above Hundred");
			}
		}
	}
}
public class Multiple_user_defined_exception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[]nums=new int[num];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		UserdefinedException err=new UserdefinedException();
		try {
		err.belowzero(nums);
		}
		catch(BelowZeroException e) {
			System.out.println(e.getMessage());
		}
		try {
		err.abovehundred(nums);
	}
		catch(AboveHundredException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End :)");
		}
}}
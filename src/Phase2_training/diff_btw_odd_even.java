package Phase2_training;
import java.util.*;

public class diff_btw_odd_even {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        int odd=0;
	        int even=0;
	        int temp=num;
	        while(temp!=0){
	            int digits=temp%10;
	            if(digits%2==0) even=even*10+digits;
	            else odd=odd*10+digits;
	            temp/=10;
	        }
	        System.out.println(Math.max(odd,even)-Math.min(odd,even));


	}

}

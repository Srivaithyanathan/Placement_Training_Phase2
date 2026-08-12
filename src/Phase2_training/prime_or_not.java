package Phase2_training;
import java.util.*;

public class prime_or_not {
	static boolean isPrime(int num){
        if(num==2) return num==2;
        if(num<=1) return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0) return false;
        }
        return true;}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(isPrime(num)) System.out.println("Prime");
        else System.out.println("Not Prime");}

}

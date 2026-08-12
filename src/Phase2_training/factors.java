package Phase2_training;
import java.util.*;

public class factors {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        List<Integer>list=new ArrayList<>();
	        for(int i=1;i*i<=num;i++){
	            if(num%i==0){
	                    if(!list.contains(i)){
	                        list.add(i);}
	                        if(!list.contains(num/i)){
	                    list.add(num/i);}}}
	                    Collections.sort(list);
	                    System.out.println(list);

	}

}

package Homework;
import java.util.*;
public class sorting_Arra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
		while(true) {
			int num=sc.nextInt();
			if(num!=-1) {
				list.add(num);
			}
			else {
				break;
			}
		}
		 int size=list.size();
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(list.get(j)>list.get(j+1)) {
					int temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
		System.out.println(list);
	}

}

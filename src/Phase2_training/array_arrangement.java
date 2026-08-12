package Phase2_training;
import java.util.*;
		public class array_arrangement{
		    public static void main(String[]args){
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int[]nums=new int[n];
		        for(int i=0;i<n;i++){
		            nums[i]=sc.nextInt();
		        }
		        int left=0;
		        int right=n-1;
		        while(left<right){
		            if(nums[left]%10==0 && nums[right]%10!=0){
		                int temp=nums[left];
		                nums[left]=nums[right];
		                nums[right]=temp;
		                left++;
		                right--;
		            }
		            else{
		                if(nums[left]%10!=0){
		                    left++;
		                }
		                if(nums[right]%10==0){
		                    right--;
		                }
		            }
		        }
		        for(int j=0;j<nums.length;j++){
		            System.out.print(nums[j]+" ");
		        }


	}

}

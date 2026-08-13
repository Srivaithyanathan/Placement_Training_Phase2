package Phase2_training;
import java.util.*;

public class Array_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            try {
                if (num<100) {
                    throw new ArithmeticException("Number less than 100");
                }
                System.out.println("Valid number: " + num);
            } catch (ArithmeticException e) {
                System.out.println("Invalid nums: " + e.getMessage());
            }
        }
    }
}

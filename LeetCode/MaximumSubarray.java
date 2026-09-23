package LeetCode;
import java.util.Scanner;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + ans);

        sc.close();
    }
}


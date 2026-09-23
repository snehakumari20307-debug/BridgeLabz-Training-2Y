package LeetCode;

import java.util.Scanner;

public class BuildArray {

    public static int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
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

        int[] ans = buildArray(nums);

        System.out.println("Result Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}

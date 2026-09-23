package LeetCode;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while (i < m) {
            arr[k++] = nums1[i++];
        }

        while (j < n) {
            arr[k++] = nums2[j++];
        }

        int size = m + n;

        if (size % 2 == 1) {
            return arr[size / 2];
        } else {
            return (arr[size / 2] + arr[(size / 2) - 1]) / 2.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);

        System.out.println("Median = " + median);

        sc.close();
    }
}

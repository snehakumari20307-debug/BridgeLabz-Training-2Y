package LeetCode;
public class NumSubarrayProduct {
    public static void main(String[] args){
        int[] nums = {10,5,2,6};
        int k = 100;
        int n = nums.length;
        int i=0;
        int j=0;
        int count = 0;
        int prod = 1;
        while(j<n){
            prod *= nums[j];
            while(prod>=k){
                prod /= nums[i];
                i++;
            }
            count += j-i+1;
            j++;
        }
        System.out.println(count);
    }
}

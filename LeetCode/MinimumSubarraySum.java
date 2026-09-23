package LeetCode;

public class MinimumSubarraySum {
    public int minArrayLen(int target, int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int minLength = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum;
                if(i==0){
                    sum = prefix[j];
                }
                else{
                    sum = prefix[j]-prefix[i-1];
                }
                if(sum>=target){
                    minLength = Math.min(minLength,j-i+1);
                }
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
    public static void main(String[] args){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        MinimumSubarraySum obj = new MinimumSubarraySum();
        int ans = obj.minArrayLen(target, nums);
        System.out.println(ans);

    }
}

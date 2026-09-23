package LeetCode;
public class LongestSubarrayAfterDelete {
    public static void main(String[] args){
        int[] nums ={0,1,1,1,0,1,1,0,1};
        int l = 0;
        int max = 0;
        int zeroCount = 0;
        for(int r = 0;r<nums.length;r++){
            if(nums[r]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[l]==0){
                    zeroCount--;
                }
                l++;
            }
            max = Math.max(max,r-l);
        }
        System.out.println(max);
    }
}

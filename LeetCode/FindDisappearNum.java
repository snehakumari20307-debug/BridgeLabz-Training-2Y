package LeetCode;
import java.util.*;
public class FindDisappearNum {
    
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        for(int i=0;i<nums.length;i++){
            int currNum = Math.abs(nums[i]);

            int idx = currNum - 1;
            if(nums[idx]<0){
                continue;
            }
            nums[idx] = -1 * nums[idx];
        }
        List<Integer> res = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        System.out.println(res);
    }
}

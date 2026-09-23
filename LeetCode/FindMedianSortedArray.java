package LeetCode;

public class FindMedianSortedArray {
    public double findMedian(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[k];
                i++;
            }
            else{
                arr[k]=nums2[k];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int size = m + n;
        if(size%2==1){
            return arr[size/2];
        }
        else{
            return (arr[size/2]+arr[size/2-1])/2.0;
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        Solution obj = new Solution();
        double median = obj.findMedian(nums1, nums2);
        System.out.println(median);
    }
}

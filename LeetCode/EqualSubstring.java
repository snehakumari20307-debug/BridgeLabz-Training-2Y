package LeetCode;
public class EqualSubstring {
    public static void main(String[] args){
        String s =  "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int left = 0;
        int cost =0;
        int maxLength = 0;
        for(int right=0;right<s.length();right++){
            cost += Math.abs(s.charAt(right)-t.charAt(right));
            while(cost>maxCost){
                cost -= Math.abs(s.charAt(left)-t.charAt(left));
                    left++;
                }
                maxLength = Math.max(maxLength,right-left+1);
            }
            System.out.println(maxLength);

        }
    }


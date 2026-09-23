package LeetCode;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int required = map.size();
        int formed = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (map.containsKey(ch) &&
                window.get(ch).intValue() == map.get(ch).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);

                window.put(remove, window.get(remove) - 1);

                if (map.containsKey(remove) &&
                    window.get(remove) < map.get(remove)) {
                    formed--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        String ans = minWindow(s, t);

        System.out.println("Minimum Window = " + ans);

        sc.close();
    }
}


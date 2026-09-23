package LeetCode;
import java.util.Scanner;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int ans = lengthOfLastWord(s);

        System.out.println("Length of Last Word = " + ans);

        sc.close();
    }
}


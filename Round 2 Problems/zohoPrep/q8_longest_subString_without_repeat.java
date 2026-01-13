//package zohoPrep;
import java.util.*;

public class q8_longest_subString_without_repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String ans = subString(str);
        System.out.println("The longest substring without repeat is: " + ans);
        System.out.println("The maximum length of the substring is: " + ans.length());
    }

    public static String subString(String str) {
        int start = 0;
        int maxLength = 0;
        int maxStart = 0; // track start of longest substring
        int[] lastSeen = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (lastSeen[ch] > start) {
                start = lastSeen[ch];
            }

            lastSeen[ch] = i + 1;

            if (i + 1 - start > maxLength) {
                maxLength = i + 1 - start;
                maxStart = start;
            }
        }

        return str.substring(maxStart, maxStart + maxLength);
    }
}

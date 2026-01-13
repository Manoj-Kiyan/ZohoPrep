package zohoPrep;
import java.util.*;

public class q6_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

   
        str = str.toLowerCase();

        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  
                cleaned.append(ch);
            }
        }

        boolean ans = isPalindrome(cleaned.toString());
        if (ans) 
            System.out.println("The Given String is a Palindrome");
        else 
            System.out.println("The Given String is Not a Palindrome");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}

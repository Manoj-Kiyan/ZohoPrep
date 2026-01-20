import java.util.*;

class AdjDupStr {
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");//abbaca
        String str=sc.next();
        System.out.println(removeDuplicates(str)); 
    }

public static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1); 
            } else {
                stack.append(c); 
            }
        }

        return stack.toString();
    }

}
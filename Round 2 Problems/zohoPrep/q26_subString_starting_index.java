import java.util.*;
public class q26_subString_starting_index {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String str1=sc.nextLine();
        System.out.println("Enter the String 2 :");
        String str2=sc.nextLine();
        int startIndex = isSubstring(str1,str2);
        if(startIndex == -1) System.out.println("The given Strings is NOT a Substring");
        else System.out.println("The given Strings is Substring and its starting from index : "+startIndex);
    }
    public static int isSubstring(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        if(len1 <  len2) return -1;
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if(str1.charAt(i+j) != str2.charAt(j)) break;                
               
            }
             if(j == len2) return i;
        }
        return -1;
    }
}

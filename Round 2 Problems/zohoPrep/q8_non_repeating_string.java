package zohoPrep;
import java.util.*;

public class q8_non_repeating_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        Character result = nonRepeatStr(str); 
        if(result == null) {
            System.out.println(-1);
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }

    public static Character nonRepeatStr(String str){
        if(str.length() < 1) return null;

        int[] count = new int[256]; 
        for(char ch : str.toCharArray()){
            count[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)] == 1) {
                return str.charAt(i); 
            }
        }
        return null;
    }
}

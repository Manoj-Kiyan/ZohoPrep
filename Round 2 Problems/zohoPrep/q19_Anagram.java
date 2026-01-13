import java.util.Scanner;
public class q19_Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1=sc.nextLine();
        System.out.println("Enter the String :");
        String str2=sc.nextLine();
        System.out.println(isAnagram(str1,str2));
    }
   
     public static boolean isAnagram(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()) return false;
        int[] count=new int[26];

        for(char ch:str1.toCharArray()){
            count[ch -'a']++;
        }
        for(char ch:str2.toCharArray()){
            if(count[ch -'a'] == 0) return false;
            count[ch -'a'] --;
        }

        for(int num : count){
            if(num != 0) return false;
        }
        return true;

    }
}


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="integral";
        String str2="triangle";
        boolean result=Anagram1(str1,str2);
        System.out.println("The Given Strings "+ str1 +" and "+str2+" are "+result);
         System.out.println(Anagram2(str1, str2));
    }

    public static boolean Anagram1(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
            return true;
        }else{
            System.out.println("Not Anagrams");
            return false;
        }
    }
    public static boolean Anagram2(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        int []charCount=new int[26];

        for(char c:str1.toCharArray()){
            charCount[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            if(charCount[c -'a']==0){
                return false;
            }
            charCount[c - 'a']--;
        }

        for(int count:charCount){
            if(count!=0){
                return false;
            }
            
        }
        return true;

    }


}

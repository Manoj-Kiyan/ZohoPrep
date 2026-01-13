import java.util.*;
public class q22_First_Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String str1=sc.nextLine();
        System.out.println("Enter the String 2 :");
        String str2=sc.nextLine();
        String ans=Occurence(str1,str2);
        System.out.println(ans);
    }
    //str1=zohocorpration;
    //str2=port;
    public static String Occurence(String str1,String str2){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < str2.length(); i++) {
            char ch=str2.charAt(i);
            for (int j = 0; j < str1.length(); j++) {
                if(str1.charAt(j) == ch){
                    if(min > j) min = j;
                    if(max < j) max=j;
                    break; 
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        for (int i = min; i <= max; i++) {
            char ch=str1.charAt(i);
            ans.append(ch);
        }
        return ans.toString();
    }
}

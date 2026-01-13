import java.util.*;
public class q18_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1=sc.nextLine();
        System.out.println("Enter the String :");
        String str2=sc.nextLine();
        System.out.println(RotationStr(str1,str2));
    }
   
     public static boolean RotationStr(String str1,String str2){
        // String doubled=str1+str1;
        // return str1.length() == str2.length() && (doubled).contains(str2);
        if(str1.length() != str2.length()) return false;
        String doubled = str1 + str1;

        for (int i = 0; i <= doubled.length() - str2.length(); i++) {
            int j;
            for (j = 0; j < str2.length(); j++) {
                if(doubled.charAt(i+j) != str2.charAt(j)) break;
            }
            if(j == str2.length()) return true;
        }
        return false;

    }

}

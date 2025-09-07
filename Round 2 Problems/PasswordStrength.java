
import java.util.Scanner;

public class PasswordStrength {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Number of password Check :");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Your Password :");
            String pass1=sc.nextLine();
            System.out.println(CheckStrength(pass1));
            
        }    
    }

    public static String CheckStrength(String pass1){
        boolean isNumber=false;
        boolean isUpper=false;
        boolean isLower=false;
        boolean isSpecial=false;

        if(pass1.length()<8){
            return "weak";
        }

        for (char str : pass1.toCharArray()) {
            if(Character.isUpperCase(str)){
                isUpper=true;
            }else if(Character.isLowerCase(str)){
                isLower=true;
            }else if(Character.isDigit(str)){
                isNumber=true;
            }else if(isSpecialCheck(str)){
                isSpecial=true;
            }     
        }
        int totalSum=0;
        if(isUpper){
            totalSum++;
        }if(isLower){
            totalSum++;
        }if(isNumber){
            totalSum++;
        }if(isSpecial){
            totalSum++;
        }
    

        if(totalSum==0 || totalSum==1){
            return "weak";
        }else if(totalSum == 2){
            return "Medium";
        }else if(totalSum == 3){
            return "Good";
        }else  return"strong";
    }

    private static boolean isSpecialCheck(char str) {
        String splchars= "`!@#$%^&*()_+[]{}';:/.,<>?|";
        for (char ch : splchars.toCharArray()) {
            if(ch==str){
                return true;
            }
        }
        return false; 
    }
    
}

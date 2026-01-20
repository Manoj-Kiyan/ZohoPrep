import java.util.Scanner;

public class duckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        String str =sc.nextLine();
        if(isDuck(str)){
            System.out.println("DUCK NUMBER ");
        }else{
            System.out.println("NOT A DUCK NUMBER");
        }
        
    }
    public static boolean isDuck(String str){
        if(str.charAt(0) == '0') return false;

        for (int i = 1; i <= str.length(); i++) {
            if(str.charAt(i) == '0') return true;
        }
        return false;

    }
}

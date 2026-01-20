import java.util.*;
public class powerWithoutMath {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int base= sc.nextInt();
         System.out.print("Enter a exponent number: ");
        int exp = sc.nextInt();
       long ans=powerOf(base, exp);
       System.out.println("FINAL ANSWER IS  : " +ans);
    }

    public static long powerOf(int base,int exp){
        long result=1;

        if(exp < 0){
            System.out.println("Negative exponent not supported without Math.pow()");
            return -1;
        }else{
            for (int i = 1; i <= exp; i++) {
                result *= base;  
            }
        }
        System.out.println(base + "^" + exp + " = " + result);
        return result;


    }
}





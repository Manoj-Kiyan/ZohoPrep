import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int num=in.nextInt();
        boolean result=Prime(num);
        System.out.println(result ?"Prime":"Not prime");
        for (int i = 0; i < num; i++) {
        boolean result2=Prime(i);
        System.out.println("The Given Number "+i+" is "+result2);
        
       }
    }
    public static boolean Prime(int num){
        if(num<1){
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

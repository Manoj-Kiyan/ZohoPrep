
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=in.nextInt();
        int result=Strong(num);
        System.out.println(result);
    }
    public static int Strong(int num){
        int rem=0;
        int sum=0;
        while(num>0){
           rem=num%10;
           int fact=rem;
           for (int i = rem-1; i>0; i--) {
            fact*=i; 
           }
           sum+=fact;
           num/=10;
        }
        return sum;
    }
}

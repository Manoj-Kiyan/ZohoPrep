
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//153
        int num=in.nextInt();
        int result=SD(num);
        System.out.println("The Sum of digits of given Number "+num+" is "+ result);
    }
    public static int SD(int num){
        int sum=0;
        int rem;

        num=Math.abs(num);
        while(num>0){
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;   

    }
}

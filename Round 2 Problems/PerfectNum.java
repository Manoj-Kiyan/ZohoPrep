
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=in.nextInt();
       perfect(num);
    }
    public static void perfect(int num){
        int sum=0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i==0){
                sum += i;
            }         
        }
    if(sum==num){
        System.out.println(" The given Number "+num+" is a Perfect Number");
    }else{
        System.out.println("The Given Number is Not a Perfect Number");
    }

    }

}


import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number");
         int num=in.nextInt();
         int result=ArmsNo(num);
         System.out.println("the sum is 9"+result);
    }

    public static int ArmsNo(int ins){
        int digits=0;
        int temp=ins;
        int sum=0;
        while(temp>0){
            temp/=10;
            digits++;
        }
        temp=ins;
        while(temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem, digits);
            temp/=10;
        }
        if(sum==ins){
            System.out.println(" The given Number "+ins+" is Armstrong Number");
        }else{
            System.out.println("The given Number is not a Armstrong Number");
        }
    return sum;
    }
}

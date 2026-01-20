import java.util.*;
public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int num= sc.nextInt();
        isStrong(num);
    }

    public static void  isStrong(int num){
      
        int temp=num;
        int sum=0;
        while(temp > 0){
            int digit=temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if(sum == num){
            System.out.println("The Given Number is STRONG ");
        }else{
            System.out.println("The given Number is NOT STRONG");
        }
    }
    public static int factorial(int n){
        int fact=1;
        for (int i = 2; i <= n; i++) {
            fact *=i;           
        }
        return fact;
    }
} 

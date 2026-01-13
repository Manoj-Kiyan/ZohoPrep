import java.util.*;
public class q10_min_psuedobinary_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int ans=psuedoBin(n);
        System.out.println("\nThere count is "+ans);
    }
    public static int psuedoBin(int n){
        int count=0;
        while(n > 0){
            int psuedo=0,place=1;
            int temp=n;
            while(temp > 0){
                int digit= temp % 10;
                if(digit > 0){
                    psuedo += place;
                }
                temp /= 10;
                place *=10;
                
            }
             n -= psuedo;
            count++;
            System.out.print(psuedo+"  ");
        }
        return count;
    }
     public static int psuedoBin1(int num){
        int maxDigit=0;
        while(num > 0){
            int digit = num % 10;
            maxDigit = Math.max(digit, maxDigit);
            num /=10;
        }
        return  maxDigit;
     }

}

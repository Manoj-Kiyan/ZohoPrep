package zohoPrep;

import java.util.Scanner;
public class q4_single_unit_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Number :");
        int n=sc.nextInt();
        int ans=unitDigit(n); 
        System.out.println(ans);  
    }
    public static int unitDigit(int num){
        while(num >= 10){
            int sum=0;
            while(num > 0){
                sum += num % 10;
                num /=10;
            }
            num = sum;
        }
        return  num;
    }
    
    
}
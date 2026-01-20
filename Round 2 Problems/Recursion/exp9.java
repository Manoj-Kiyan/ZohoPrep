
import java.util.Scanner;

public class exp9 {
   
    static int digits=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        System.out.println("The Number of digits is "+Recursion1(num));
    }
    public static int Recursion1(int num){ 
        if(num > 0){    
           digits++;
           num /=10;
           Recursion1(num);
        }
        return digits;
    }
}

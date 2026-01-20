
import java.util.Scanner;

public class exp10
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        System.out.println("Fibonacci Series upto "+num+" terms ");
        for (int i = 0; i < num; i++) {
            System.out.println("Term "+i+" : "+fibo(i)+" ");
            
        }
    }
    public static int fibo(int num){ 
        if(num <= 0) return 0;
        if(num == 1) return 1;

        return fibo(num-2) + fibo(num-1);
        
    }
}

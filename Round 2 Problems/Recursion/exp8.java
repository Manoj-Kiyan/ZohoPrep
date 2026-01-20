
import java.util.Scanner;

public class exp8 {
    static int count=1;
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        System.out.println("The Sum of N Natural Numbers is "+Recursion1(num));
    }
    public static int Recursion1(int num){ 
        if(count <=num){    
            sum +=count;
            count++;
            Recursion1(num);
        }
        return sum;
    }
}

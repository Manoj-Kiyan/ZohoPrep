
import java.util.Scanner;

public class exp5 {
    static int count=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        Recursion1(num);
    }
    public static void Recursion1(int num){
        if(count <= num){
            System.out.print(num+" ");
            num--;
            Recursion1(num);
        }
    }
}

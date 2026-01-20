package Patterns;
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Input : ");
        int n=sc.nextInt();
        Pattern12(n);
    }
    public static void Pattern12(int n){
        for (int i = 1; i <= n*2-1; i++) {
            int cr=i<=n ? i:n*2-i;
            int sp=cr-1;
            for (int space = 1; space <= sp; space++) {
                System.out.print(" ");
            }
            for (int j = cr; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}

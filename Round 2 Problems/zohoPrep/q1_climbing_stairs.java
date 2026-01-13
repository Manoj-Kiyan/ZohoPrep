package zohoPrep;

import java.util.Scanner;

public class q1_climbing_stairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stairs :");
        int n=sc.nextInt();
        int ans=climb(n);
        System.out.println(ans);
    }
    public static int climb(int n){
        int[] stairs=new int[n+1];
        stairs[0]=1;
        stairs[1]=1;
        for (int i = 2; i < stairs.length; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];

    }
    
}

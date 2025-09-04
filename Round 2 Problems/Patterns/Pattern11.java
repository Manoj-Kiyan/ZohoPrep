package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n=7;
        Pattern(n);  
    }

    public static void Pattern(int n){
        for (int i = 0; i <= n; i++){
            int space=n-i;
            for (int sp = 0; sp < space; sp++) {
                System.out.print(" ");
            }
            int val=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val+" ");
                val = val * (i-j) / (j+1);
            }
            System.out.println();

        }
    }
    
}


package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n=4;
        Pattern(n);
    }

    public static void Pattern(int n){
        for (int i = 1; i <= n*2; i++) {
            int cr= i<=n ? i:2*n-i;
            int space=n-cr;
            for (int sp = 1; sp <= space; sp++) {
                System.out.print(" ");   
            }
            int curr=(cr*(cr+1)/2);
            for (int j = 1; j <= cr; j++) {
                System.out.print(curr-- + " ");
            }
            System.out.println();
            
        }

    }
    
}

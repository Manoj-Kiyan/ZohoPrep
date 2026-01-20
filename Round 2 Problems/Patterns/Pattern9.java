package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        Pattern(n);
        Pattern2(4);
    }

    public static void Pattern(int n){
        for (int i = 1; i <= n*2; i++) {
            int cr= i<=n ? i:2*n-i+1;
            int space=n-cr;
            for (int sp = 0; sp <= space; sp++) {
                System.out.print(" ");   
            }
            int curr=(cr*(cr+1))/2;
            for (int j = 1; j <= cr; j++) {
                System.out.print(curr-- + " ");
            }
            System.out.println();
            
        }

    }



    public static void Pattern2(int n) {
        for (int i = 1; i <= n * 2; i++) {

          
            int cr = i <= n ? i : 2 * n - i + 1;  

           
            int space = n - cr;
            for (int sp = 0; sp < space; sp++) {
                System.out.print("   "); 
            }

            
            int start = cr * cr;
            int end = start - (2 * cr - 1) + 1;

            
            for (int num = start; num >= end; num--) {
                System.out.print(num + "  ");
            }

            System.out.println();
        }
    }
}

    


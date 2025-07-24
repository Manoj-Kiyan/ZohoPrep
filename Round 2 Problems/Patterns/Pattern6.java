package Patterns;

            /*
            
             1
            212
           32123
          4321234
            
            */

public class Pattern6 {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) {
            
            int space=n-i;
            for (int s = 1; s<=space; s++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        
        }
    }
}

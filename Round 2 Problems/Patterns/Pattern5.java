package Patterns;

/*
    * 
   * * 
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */

public class Pattern5 {
    public static void main(String[] args) {
        Pattern(5);
        
    }
    public static void Pattern(int n){
        for (int i = 1; i <= n*2; i++) {
            int cr= i>n ? n*2-i :i;
            int space=n-cr;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");   
            }
            for (int j = 1; j <= cr; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}

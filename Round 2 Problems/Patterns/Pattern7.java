package Patterns;

/*
 
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

        
 */

public class Pattern7 {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for (int i = 1; i <=n*2; i++) {
            int cr=i>n ? 2*n-i : i;
            int space=n-cr;
            for (int s = 1; s <=space; s++) {
                System.out.print(" ");
            }
           for (int j = cr; j>=1; j--) {
            System.out.print(j);
           }
           for (int j=2; j<=cr; j++) {
                System.out.print(j);  
           }
           System.out.println();
        }
    }
}

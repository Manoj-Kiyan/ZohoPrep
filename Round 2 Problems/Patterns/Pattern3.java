package Patterns;

public class Pattern3 {

                /*

            1 
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5 

            */
    public static void main(String[] args) {
        Pattern1(5);
        Pattern2(5);
    }
    public static void Pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }            
            System.out.println();
        }
    }
      public static void Pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }            
            System.out.println();
        }
    }
    
}

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

public class Pattern4 {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for (int i = 1; i <=n*2; i++) {
            int cr= i>n ? n*2-i : i;
            for (int j = 1; j <=cr; j++) {
                System.out.print("* ");   
            }
            System.out.println();
            
        }
    }
}

package Patterns;

// A
// B B
// C C C
// D D D D
// E E E E E


public class Pattern8 {
    public static void main(String[] args) {
            Pattern(5);
            Pattern1(5);
            Pattern2(5);
         Pattern3(5);
         Pattern4(5);
         Pattern5(5);
         Pattern6(5);
    }
    public static void Pattern(int n){
        for (int i = 0; i < n; i++) {
            char ch=(char)('A'+i);
            for (int j = 0; j <= i ; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
            
        }
    }

// A
// A B
// A B C
// A B C D
// A B C D E

    public static void Pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                char ch=(char)('A'+i);
                System.out.print(ch+" ");
            }
            System.out.println();
            
        }
   }

// E
// D D
// C C C
// B B B B
// A A A A A
   public static void Pattern2(int n){
    for (int i = 0; i < n; i++) {
        char ch=(char)('E' - i);
        for (int j = 0; j<=i; j++) {
            System.out.print(ch+" ");
        }
        System.out.println();
        
    }
   }

// A B C D E
// A B C D
// A B C
// A B
// A
   public static void Pattern3(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < n-i+1; j++) {
            char ch=(char)('A' + j);
            System.out.print(ch+" ");
            
        }
        System.out.println();
        
    }

   }

//     A
//    A B
//   A B C
//  A B C D
// A B C D E
 public static void Pattern4(int n){
    for (int i = 0; i < n; i++) {
        int spaces=n-i;
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            char ch=(char)('A'+j);
            System.out.print(ch+" ");
            
        }
        System.out.println();
        
    }
 }

//     A
//    A B
//   A B C
//  A B C D
// A B C D E
// A B C D E
//  A B C D 
//   A B C
//    A B
//     A
    public static void Pattern5(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int cr = i < n ? i + 1 : 2 * n - 1 - i;
            int spaces = n - cr; 

            
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < cr; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
// A       A
//  B     B
//   C   C
//    D D
//     E
//    D D
//   C   C
//  B     B
// A       A
            
    public static void Pattern6(int n){
        for (int i = 0; i < n*2-1; i++) {
            for (int j = 0; j <n*2-1; j++) {
                if(i==j || j==(2*n-2-i)){
                    char ch=(char)('A'+Math.min(i,2*n-2-i));
                    System.out.print(ch+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}





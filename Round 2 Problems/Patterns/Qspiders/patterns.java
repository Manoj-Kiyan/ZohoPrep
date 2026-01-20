public class patterns{
    public static void main(String[] args) throws Exception{
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(9);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
        System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(5);
        System.out.println();
       pattern19(5);
       System.out.println();
        pattern20(7);
        System.out.println();
        pattern21(7);
        System.out.println();
        pattern22(7);
        System.out.println();
        pattern23(7);
        System.out.println();
        pattern24(13);
        System.out.println();
        pattern25(13);

    }   

    public static void pattern1(){
        if(true){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void pattern2(){
        for (int i = 0; i < 3; i++) {
            if(true){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            System.out.print("");
        }
    }
    public static void pattern3(){
        for (int i = 0; i < 5; i++) {
            if(true){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            System.out.print(" ");
        }
    }
    public static void pattern4(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if(true) System.out.print("* ");

                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(true) System.out.print("* ");

                else System.out.print("  ");
            }
            System.out.println();
            
        }
    }

    public static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(true) System.out.print(j+1 +" ");
                
                else System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    public static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(true){
                    System.out.print(j % 2 +"  ");
                }else{
                    System.out.print("  ");
                }                
            }
            System.out.println();
            
        }
    }
    public static void pattern8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
       public static void pattern9(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1|| j == n-1 ||i==n/2 || j==n/2 || i == j || i+j == n-1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern10(int n) throws Exception{
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 || i==j && j<=n/2 ||i+j == n-1 && j>=n/2 || j==n-1) System.out.print("M ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.print("  ");

            for (int j = 0; j < n; j++) {
                if(j==0||i==0||j==n-1||i==n/2) System.out.print("I ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.print("   ");

            for (int j = 0; j < n; j++) {
                if(j==0 || i==j || j==n-1) System.out.print("Y ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.print("  ");
            
            for (int j = 0; j < n; j++) {
                if(i==0||j==0||i==n-1||j==n-1) System.out.print("A ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.print("  ");

            for (int j = 0; j < n; j++) {
                if(i==0||j==n/2||i==n-1 && j<=n/2) System.out.print("N ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.println();

        } 
    }
        public static void pattern11(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print(i +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
     public static void pattern12(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print(j+1 +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    System.out.print(n-j +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            int k=1;
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    System.out.print(k++ +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            char k='A';
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    System.out.print(k++ +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print(j%2 +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
     public static void pattern17(int n){
        for (int i = 0; i < n; i++) {
            int num=1;
            char ch='A';
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    if(i%2 ==0 ) System.out.print(num++ +" ");
                    else System.out.print(ch++ +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        for (int i = 0; i < n; i++) {
            //int num=4;
        
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                  //System.out.print(num++ +" ");
                  System.out.print(i+j +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern19(int n) throws Exception{
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(true) System.out.print("$ ");
                else System.out.print(" ");
                Thread.sleep(50);
            }
            System.out.print("");

            for (int j = 0; j < n; j++) {
                if(true) System.out.print("# ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.println();
        }
         for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n; j++) {
                if(true) System.out.print("@ ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.print("");
            
            for (int j = 0; j < n; j++) {
                if(true) System.out.print("! ");
                else System.out.print("  ");
                Thread.sleep(50);
            }
            System.out.println();
         }  
    }
     public static void pattern20(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j && i+j>=n-1 || i<=j && i+j<=n-1){
                    System.out.print("*" +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for (int i = 0; i < n; i++) {
            int k=1;
            for (int j = 0; j < n; j++) {
                if(i>=j && i+j>=n-1){
                    System.out.print(k++ +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // public static void patterns22(int n){
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if(i+j <=n-1 && i>=j || i+j >=n-1 && i<=j){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

     public static void pattern22(int n){
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if(i>=j+n/2 || i<=j-n/2 || i+j >=n-1+n/2 ||i+j <=n-1-n/2 ){
                    System.out.print("*" +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
     public static void pattern23(int n){
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if(i>=j+n/2 || i<=j-n/2 || i+j >=n-1+n/2 ||i+j <=n-1-n/2 ){
                    System.out.print(" " +" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern24(int n){
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if(i==j+n/2 || i==j-n/2 || i+j==n-1+n/2 ||i+j==n-1-n/2 ){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern25(int n){
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if(i==j+n/2 || i==j-n/2 || i+j==n-1+n/2 ||i+j==n-1-n/2 ){
                    System.out.print("*" +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}

   
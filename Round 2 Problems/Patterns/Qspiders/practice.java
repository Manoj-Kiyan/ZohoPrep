public class practice {
  public static void main(String[] args) throws Exception{
    patterns(13);   
}

    public static void patterns(int n){
        for (int i = 0; i < n; i++) {
            //int k=1;
            for (int j = 0; j < n; j++) {
                if(i==j + n/2 || i==j-n/2 ||i+j==n-1+n/2||i+j ==n-1-n/2){

                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
             for (int j = 0; j < n; j++) {
                if(i==j + n/2 || i==j-n/2 ||i+j==n-1+n/2||i+j ==n-1-n/2){

                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            //int k=1;
            for (int j = 0; j < n; j++) {
                if(i==j + n/2 || i==j-n/2 ||i+j==n-1+n/2||i+j ==n-1-n/2){

                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
             for (int j = 0; j < n; j++) {
                if(i==j + n/2 || i==j-n/2 ||i+j==n-1+n/2||i+j ==n-1-n/2){

                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
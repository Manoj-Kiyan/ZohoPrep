package Patterns;

public class Pattern10 {
    public static void main(String[] args){
        int row=4;
        int col=5;
        Pattern(row,col);
    }

    public static void Pattern(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0|| i==r-1||j==0||j==c-1){
                    System.out.print("X"+" ");
                }else{
                    System.out.print("O"+" ");
                }
            }
            System.out.println();
        }

    }
        
}

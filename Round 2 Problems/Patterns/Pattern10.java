package Patterns;

public class Pattern10 {
    public static void main(String[] args){
        int row=4;
        int col=5;
        Pattern(row,col);
    }

    public static void Pattern(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0|| i==row-1||j==0||j==col-1){
                    System.out.print("X"+" ");
                }else{
                    System.out.print("O"+" ");
                }
            }
            System.out.println();
        }

    }
        
}

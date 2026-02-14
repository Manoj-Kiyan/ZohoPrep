import java.util.*;
public class q31_matrix_tanspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int row= sc.nextInt();
        System.out.println("Enter the no of cols :");
        int col=sc.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of matrix ( "+ i + ","+ j+")");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORGINAL MATRIX :");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        tansposeMatrix(matrix,row,col);
    }
    public static void tansposeMatrix(int[][] matrix,int row ,int col){
        int[][] tanspose =  new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tanspose[j][i]=matrix[i][j];
            }
        }
        System.out.println("TANSPOSE MATRIX :");
        for (int i = 0; i <col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tanspose[i][j] +" ");
            }
            System.out.println();
        }
    }
}

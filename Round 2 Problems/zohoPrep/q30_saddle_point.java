import java.util.*;
public class q30_saddle_point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        findSaddle(matrix);

    }
    public static void findSaddle(int[][] matrix){
        int row =  matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int minRow = matrix[i][0];
            int minColIndex=0;
            for (int j = 1; j < col; j++) {
                if(minRow  > matrix[i][j]){
                    minRow=matrix[i][j];
                    minColIndex=j;
                }
            }

            boolean isSaddle= true;
            boolean found=true;
            for (int k = 0; k < row; k++) {
                if(minRow < matrix[k][minColIndex]){
                    isSaddle = false;
                    break;
                }
            }
            if(isSaddle){
                System.out.println("SADDLE POINT : "+ minRow );
                found= true;
            }
            if(!found) System.out.println("NO SADDLE FOUND");
            

        }


    }
}

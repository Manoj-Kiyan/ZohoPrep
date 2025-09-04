public class RectangleMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4,5,6},
            {5,4,3,2,5,7},
            {7,6,5,4,3,6},
            {9,8,7,6,5,4}
        };
        int row1=2,col1=0;
        int row2=3,col2=5;

        RectangleSum(matrix,row1,col1,row2,col2);
    }
    public static void RectangleSum(int[][] matrix,int row1,int col1,int row2,int col2){
        if(row1 > row2 || col1 > col2){
            System.out.print("Invalid Indcies. . .");
            return;
        }
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                System.out.print(matrix[i][j] +" ");
                
            }
            System.out.println();
        }
        int sum=0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum +=matrix[i][j];
            }
        }
    System.out.println(" Sum  : "+ sum);
    
    }
}

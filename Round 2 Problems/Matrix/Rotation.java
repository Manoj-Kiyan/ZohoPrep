import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int r=3;
        int c=3;
       
        System.out.println("Enter Number of Rotation : ");
        int rotation=sc.nextInt();

        for (int i = 0; i < rotation; i++) {
             MatrixRotation(matrix,r,c);
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+ " "); 
            }
            System.out.println();
        }
    }
    public static void MatrixRotation(int[][] matrix,int m,int n){
        int row=0,col=0;
        int prev;
        int curr;

        while(row <=m && col<=n){
            if(row >= m-1 || col >= n-1) break;
                prev=matrix[row +1][col];

                for (int i = col; i < n; i++) {
                    curr=matrix[row][i];
                    matrix[row][i]=prev;
                    prev=curr;
                }
                row++;

                for (int i = row; i < m; i++) {
                    curr=matrix[i][n -1];
                    matrix[i][n-1]=prev;
                    prev=curr;
                }
                n--;

                if(row < m){
                    for (int i = n-1; i >= col; i--) {
                        curr=matrix[m-1][i];
                        matrix[m-1][i]=prev;
                        prev=curr;    
                    }
                }
                m--;
                if(col < n){
                    for (int i = m-1; i >= row; i--) {
                        curr=matrix[i][col];
                        matrix[i][col]=prev;
                        prev=curr;
                    }
                }
                col++;
        }

    }

        
}


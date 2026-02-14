import java.util.*;
public class q29_rotational_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotation :");
        int numOfrotate=sc.nextInt();
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int r=3;
        int c=3;
        for (int i = 0; i < numOfrotate; i++) {
            rotation(matrix,r,c);
        }
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+" ");    
            }
            System.out.println();
        }
    }
    public static void rotation(int[][] matrix,int r,int c){
        int row=0,col=0;
        int prev,cur;

        while(row  <= r-1  && col <= c-1){
            if(row >= r-1 && col >= c-1) break;
            prev=matrix[row+1][col];

            for (int i = col; i < c; i++) {
                cur = matrix[row][i];
                matrix[row][i]=prev;
                prev=cur;
            }
            row++;
            for(int i = row;i < r ; i++){
                cur=matrix[i][r-1];
                matrix[i][r-1]=prev;
                prev=cur;
            }
            c--;
            for(int i= c-1; i >= col;i--){
                cur=matrix[r-1][i];
                matrix[r-1][i]=prev;
                prev=cur;
            }
            r--;
            for(int i=r-1;i >= row;i--){
                cur=matrix[i][col];
                matrix[i][col]=prev;
                prev=cur;
            }
            col++;
          
        }

    }
}


// import java.util.*;

// public class q29_rotational_matrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rotations:");
//         int numOfrotate = sc.nextInt();

//         int[][] matrix = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         int r = 3;
//         int c = 3;

//         for (int i = 0; i < numOfrotate; i++) {
//             rotation(matrix, r, c);
//         }

//         // Print the rotated matrix
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void rotation(int[][] matrix, int r, int c) {
//         // Rotate the outer ring once clockwise
//         int prev = matrix[1][0]; // element just below top-left

//         // Top row
//         for (int i = 0; i < c; i++) {
//             int cur = matrix[0][i];
//             matrix[0][i] = prev;
//             prev = cur;
//         }

//         // Right column
//         for (int i = 1; i < r; i++) {
//             int cur = matrix[i][c-1];
//             matrix[i][c-1] = prev;
//             prev = cur;
//         }

//         // Bottom row
//         for (int i = c-2; i >= 0; i--) {
//             int cur = matrix[r-1][i];
//             matrix[r-1][i] = prev;
//             prev = cur;
//         }

//         // Left column
//         for (int i = r-2; i >= 0; i--) {
//             int cur = matrix[i][0];
//             matrix[i][0] = prev;
//             prev = cur;
//         }
//     }
// }

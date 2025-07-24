
import java.util.Arrays;

public class Bs2D {
    public static void main(String[] args) {
        int[][] arr={
            {2,3,4,5,6},
            {7,8,9,4,5},
            {7,3,1,9,5}
        };
        int target=5;
        int[] ans=Bs2D1(arr,target,0,3);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Bs2D1(int[][] arr,int target,int start,int end){
        for (int i = start; i <= end && i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
                
            }

           
        }
         return new int[]{-1,-1};
    }
}

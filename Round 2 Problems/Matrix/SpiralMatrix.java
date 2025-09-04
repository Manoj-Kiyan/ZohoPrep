class SpiralMatrix{

    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {11,12,14}
          
        };
        SpMatrix(matrix);
    }
    public static void SpMatrix(int[][] matrix){
        if(matrix == null && matrix.length==0){
            return;
        }

       
        int left = 0,right=matrix[0].length-1;
        int top=0,bottom=matrix.length-1;

        while(top<=bottom && left <= right) {

                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i]+" ");  
                }
                top++; //1
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right]+" ");
                }
                right--; //1

                if(top<=bottom){
                    for (int i = right; i >=left; i--) {
                        System.out.print(matrix[bottom][i]+" ");   
                    }
                    bottom--;
                }   
                if(left<=right){
                    // for (int i = left; i <=top; i++) {
                    // System.out.println(matrix[bottom][i]+" ");   
                    for (int j = bottom; j >= top; j--) {
                        System.out.print(matrix[j][left]+" ");
                    } 
                    left++;
                    }
                }   
            }  
    }









public class LsMax {
       public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4,5},
            {65,33,55,77,22},
            {34,13},
            {23,21,16}};
            int maxVal=Integer.MIN_VALUE;
            maxVal= max(arr,maxVal,0,4);
            System.out.println("Max Value is "+ maxVal);
    }
    static int max(int[][] arr,int maxVal,int start,int end){
        for (int i = start; i<end && i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>maxVal){
                     maxVal=arr[i][j];
                }
               
            } 
        } 
          return maxVal;
    }
}

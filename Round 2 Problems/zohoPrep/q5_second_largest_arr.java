package zohoPrep;

import Arrays.leftRotation;

public class q5_second_largest_arr {
    public static void main(String[] args) {
        int[] arr={5,5,5};
        int ans=secondLargest(arr);
        System.out.println(ans);
    }
    public static int secondLargest(int[] arr){
        
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        if(arr.length == 0 || arr.length ==1) return -1;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i] > secondLargest && secondLargest !=largest){
                secondLargest =largest;
            }
            
        }
       return secondLargest;
    }
}

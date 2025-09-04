
import java.util.Arrays;

public class SecondLargestArr {
    public static void main(String[] args) {
        int[] arr={23,711,56,33,78};
        largest(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void largest(int[] arr,int start,int end){
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;

        // if (arr[0] > arr[1]) {
        //     largest = arr[0];
        //     SecondLargest = arr[1];
        // } else {
        //     largest = arr[1];
        //     SecondLargest = arr[0];
        // }

        for (int i = 0; i < arr.length; i++) {
            int current=arr[i];
            if(current>largest){
                SecondLargest=largest;
                largest=current;
            }else if(current>SecondLargest && current!=largest){
                SecondLargest=current;
            }
        }
        System.out.println("The second Largest Element is "+SecondLargest);
        System.out.println("The Largest element in the arrays is "+largest);
        
    }
}

package Sorting;
import java.util.*;

public class PosNeg {
    public static void main(String[] args) {
        int[] arr={
            2,4,5,7,-5,-3,-8
        };
        ve(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ve(int[] arr){
        int right=arr.length-1;
        int left=0;
        while(left<right){
            //pos && pos
            if(arr[left] > 0 && arr[right] > 0){
                left++;
            }
            //pos && neg
            else if(arr[left] > 0 && arr[right] < 0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;
                left++;
            }
            //neg && pos
            else if(arr[left] < 0 && arr[right] > 0){
                right--;
                left++;
                //neg && neg
            }else{
                left++;
            }

        }
        
    }
}

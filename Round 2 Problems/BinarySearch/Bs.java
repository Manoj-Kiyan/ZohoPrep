import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Bs {
    public static void main(String[] args) {
        int[] arr={23,45,67,89,123,456,788,999};
        int target=456;
        int ans=binary(arr,target);
        System.out.println("The target VAlue index is "+ans);
    }
    static int binary(int[]arr,int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(target > arr[mid]){
                start=mid + 1;
            }else if (target<arr[mid]) {
                end=mid - 1;
            }else{
                return mid;
            }

        }

    
    return -1;
}
}

package Arrays;

import java.util.*;
public class Shift {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Rshift(arr);
        System.out.println("\n");
        System.out.println(Arrays.toString(arr));
        Lshift(arr);
    }
    
    public static void Lshift(int[] arr){
         int n=arr.length;
         int start=arr[0];
         for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=start;
        System.out.println("After Left Shift Rotate :");
        System.out.println(Arrays.toString(arr));

    }
    public static void Rshift(int[] arr){
        int n= arr.length;
        int last=arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
        System.out.println("After Right Shift Rotate :");
        System.out.println(Arrays.toString(arr));
    }
}

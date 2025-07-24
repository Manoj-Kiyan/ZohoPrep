package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,9,7,2,6};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
               if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }  
            } 
            
        }
    }
}

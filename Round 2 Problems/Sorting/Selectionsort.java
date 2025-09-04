package Sorting;

import java.util.Arrays;

public class Selectionsort {

    public static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last =arr.length-i-1;
            int getmax=maxitem(arr,0,last);
            swap(arr,getmax,last);
        }
    }
    static  void swap(int[] arr,int f,int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
    static int maxitem(int[] arr,int start,int last){
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
            
        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr={23,43,11,5,6,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}

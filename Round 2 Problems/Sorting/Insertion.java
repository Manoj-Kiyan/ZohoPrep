package Sorting;

import java.util.Arrays;

public class Insertion {
  public static void main(String[] args) {
    int[] arr={27,54,22,53,84,1};
    Insert(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void Insert(int[] arr){
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for (int i= 1; i<arr.length; i++) {
          for (int j = i; j > 0; j--) {
            if(arr[j]<arr[j-1]){
              swap(arr,j,j-1);

            }else{
              break;
            }
            
          }
        }  
  }
     public static void swap(int[]arr,int f,int l){
          int temp=arr[f];
          arr[f]=arr[l];
          arr[l]=temp;

        }
}

package Sorting;
import java.util.*;

public class countSort {
    public static void main(String[] args) {
        int[] arr = {27,54,22,53,84,1};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void countsort(int[] a){
        int[] res = new int[findLargest(a) + 1];

        // count frequency
        for (int i = 0; i < a.length; i++) {
            res[a[i]]++;
        }

        // rebuild array
        for (int i = 0, x = 0; i < res.length; i++) {
            while(res[i] > 0){
                a[x++] = i;
                res[i]--;
            }
        }
    }
}

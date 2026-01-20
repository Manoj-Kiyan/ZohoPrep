package Arrays;
import java.util.*;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr1={23,03,2004};
        int[] arr2={16,11,39};
        combine(arr1,arr2);
    }
    public static void combine(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
        }
      
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}


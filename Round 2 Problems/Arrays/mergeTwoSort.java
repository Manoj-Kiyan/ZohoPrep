 package Arrays;
import java.util.*;

public class mergeTwoSort {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={10,9,8,7,6};
        System.out.println("Arrays Before Sorting :");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        mergeArr(a,b);
        
    }
    public static void mergeArr(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0,k=0;
        int m=arr1.length;
        int n=arr2.length;
        int[] ans=new int[m+n];
       
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                ans[k++]=arr1[i++];
            }else{
                ans[k++]=arr2[j++];
            }
        }
        while(j < n){
            ans[k++]=arr2[j++];
        }
        while(i < m){
            ans[k++]=arr1[i++];
        }
        System.out.println("Arrays After Merged : ");
        System.out.println(Arrays.toString(ans));

    }
    
}


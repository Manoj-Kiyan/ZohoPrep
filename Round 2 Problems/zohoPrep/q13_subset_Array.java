import java.util.*;
public class q13_subset_Array {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,5};
        boolean ans=isSubset(arr1,arr2);
        if(ans) System.out.println("SUBSET ARRAY");
        else System.out.println("NOT A SUBSET ARRAY");
    }
    public static boolean  isSubset(int[] arr1,int[] arr2){
        Set<Integer> ans=new HashSet<>();
        for(int num:arr1){
            ans.add(num);
        }
        for(int num:arr2){
            if(!ans.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static boolean  isSubset2(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(arr1.length > i && j < arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
    
}

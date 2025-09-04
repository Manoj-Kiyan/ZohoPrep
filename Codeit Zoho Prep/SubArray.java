
import java.util.Arrays;
import java.util.HashSet;

public class SubArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={3,4,5,9};
        System.out.println(SubsetArray(arr1,arr2));
        System.out.println(SubsetArray1(arr1,arr2));
    }

    public static boolean SubsetArray(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }else{
                return false;
            }
        }
         return j == arr2.length;
    }
    public static boolean SubsetArray1(int [] arr1,int[] arr2){
        HashSet <Integer> set=new  HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num: arr2) {
            if(!set.contains(num)){
                return false;
            }   
        }

        return true;
    }
}

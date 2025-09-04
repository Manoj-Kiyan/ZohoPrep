
import java.util.HashMap;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,2,4,5,3,4};
        System.out.println(UniqueFind(arr));
        System.out.println(UniqueFind1(arr));
        System.out.println(UniqueFind2(arr));
    }

    public static int UniqueFind(int[] arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result ^=arr[i];   
        }
        return result;
    }

    public static int UniqueFind1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }

    public static int UniqueFind2(int[] arr){
        HashMap <Integer,Integer> map=new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (int num : arr) {
            if(map.get(num)==1){
                return num;
            }          
        }
        return -1;
    }
}

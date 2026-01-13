
import java.util.*;

public class q12_uniqueElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,3,2,1,0,4,3,7};
        System.out.println(unique(arr));
        System.out.println(Arrays.toString(unique2(arr)));
        System.out.println(unique3(arr));

    }
    //BRUTE FORCE METHOD :
     public static int unique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;

     }

    //USING HASH MAP:
     public static int[] unique2(int[] arr) {
    Map<Integer, Integer> ans = new HashMap<>();
    List<Integer> result = new ArrayList<>();

    for (int num : arr) {
        ans.put(num, ans.getOrDefault(num, 0) + 1);
    }
    for (int num : arr) {
        if (ans.get(num) == 1) {
            result.add(num);
        }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
}


    //XOR METHOD ONLY WORK ON WHEN ELEMENTS PRESENT TWICE :
    public static int unique3(int[] arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result ^=arr[i];
        }
        return  result;
    }
}

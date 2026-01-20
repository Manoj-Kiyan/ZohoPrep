package Arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int ans=unique(arr);
        System.out.println(ans);
        unique1(arr);
    }
    public static int unique(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
     public static void unique1(int[] arr){
            Map<Integer, Integer> map = new HashMap<>();
                for (int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);

                for (int key : map.keySet())
            if (map.get(key) == 1)
                System.out.println(key);
     }

}

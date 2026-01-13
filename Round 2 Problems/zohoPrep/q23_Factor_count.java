import java.util.*;

public class q23_Factor_count {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 16};
        factorCount(arr);
    }

    public static void factorCount(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (countFactor(arr[j]) < countFactor(arr[j+1])) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int countFactor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        return count;
    }
}

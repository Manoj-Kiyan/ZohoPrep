package Arrays;

public class sumNum {
    public static void main(String[] args) {
        int[] arr={8,4,3,6,2};
        formArr(arr);
    }
    public static void formArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

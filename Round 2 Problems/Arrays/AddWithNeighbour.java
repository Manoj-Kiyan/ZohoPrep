package Arrays;

public class AddWithNeighbour {
    public static void main(String[] args) {
        int[] arr={8,4,3,6,2};
        formArr(arr);
    }
    public static void formArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}

package Arrays;

public class practice {
        public static void main(String[] args) {
        int[] arr={8,4,3,6,2};
        formArr(arr);
    }
    public static void formArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(");
              for (int k = i; k <= j; k++) {
                  System.out.print(arr[k]);
              }
              System.out.print( ")"+" ");
            }
            System.out.println();
        }
    }
}

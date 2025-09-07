//Least Significant Bit:
package Bits;

public class LSB {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,2,1,3,6,4};
        int ans=LeastBit(arr);
        System.out.println(ans);
    }

    public static int LeastBit(int[] arr){
        int unique=0;

        for (int i : arr) {
            unique ^=i;
            
        }
        return unique;

    }



}

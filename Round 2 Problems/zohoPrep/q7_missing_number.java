package zohoPrep;

public class q7_missing_number {
    public static void main(String[] args) {
        int[] arr={3,0,1}; // 2  --> 0,1,2,1
        int[] arr2={1,2,3,0}; // 4 -->0,1,2,3,4
        int[] arr3={1,2};// 0 --> 0,1,2
        int ans = findMissingNum(arr2);
        System.out.println(ans);
    }
    public static int findMissingNum(int[] arr){
        int len= arr.length;
        int total = len * (len +1)/2;
        for(int num : arr){
            total -= num;
        }
        return total;
    }

}

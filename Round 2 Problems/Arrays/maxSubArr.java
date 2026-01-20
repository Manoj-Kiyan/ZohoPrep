package Arrays;

public class maxSubArr {
    public static void main(String[] args) {
    
    int[] arr={2,5,6,7,9,22};
    maxSub(arr);

    }
    public static void maxSub(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k= i; k <= j; k++) {
                    System.out.println(arr[k]);
                    sum += arr[k];
                    maxSum=Math.max(maxSum, sum);
                }
                System.out.println("Sum is "+ sum);
            }
        }
        System.out.println("Maximum Sum is  "+maxSum);
    }
}


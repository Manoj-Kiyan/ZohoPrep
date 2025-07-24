

public class max {
    public static void main(String[] args) {
        int[] arr={7,8,4,5,1,2};
        MaxMin(arr);
       
    }

    static void MaxMin(int[] arr){
        int Min=0;
        int Max=0;
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[Max]){
                Max=i;
            }
            if(arr[i]<arr[Min]){
                Min=i;
            }
        }
        System.out.println("The max Value present in "+Max);
        System.out.println("The Min Value present in "+Min);
    }
}

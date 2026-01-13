
import java.util.*;

public class q15_Kth_smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,99,33,55,11,56,88};
        System.out.println("Which smallest element you find :");
        int k=sc.nextInt();
        int ans=KthSmallest2(arr,k);
        System.out.println(ans);
    }
    public static int KthSmallest1(int[] arr,int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int num:arr){
            minHeap.add(num);
        }
        for (int i = 0; i < k-1; i++) {
            minHeap.poll();
        }

        return  minHeap.peek();

    }
    public static int KthSmallest2(int[] arr,int k){
        //5 4 3 2 1 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        return arr[k-1];
    }
}

package Arrays;
import java.util.*;

public class intArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element :"+i);
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        evenIndex(arr);
        secodnLast(arr);
        System.out.println(isEmpty(arr));
        sumOfTwoArrays(arr);
        minOfTwo(arr);
        maxOfTwo(arr);
    }

    public static void evenIndex(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 ==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void secodnLast(int[] arr){
       
           int second=arr[1];
           int lastSecond=arr[arr.length-2];
           System.out.println("second"+second+"\tlastSecod :"+lastSecond);
        
    }
    public static boolean  isEmpty(int[] arr){
        if(arr.length==0) return true;
        else return false;
    }
    public static void sumOfTwoArrays(int[] arr){
        int[] arr2={5,4,3,2,1};
        if(arr.length != arr2.length) return;
        int[] sumArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sumArr[i] += arr[i]+arr2[i];
        }
        System.out.println(Arrays.toString(sumArr));
    }
    public static void minOfTwo(int[] arr){
        int first_min=Integer.MAX_VALUE;
        int  second_min=Integer.MAX_VALUE;
        for(int num:arr){
            if(num < first_min){
                second_min=first_min;
                first_min=num;
                
            }else if(num < second_min && num !=first_min){
                second_min=num;
            }
        }
        System.out.println("First Minimun is :"+first_min);
        System.out.println("Second Minimun is :"+second_min);
    }//10,20,30,40
    public static void maxOfTwo(int[] arr){
        int first_max=Integer.MIN_VALUE;
        int  second_max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num > first_max){
                second_max=first_max;
                first_max=num;
                
            }else if(num > second_max && num !=first_max){
                second_max=num;
            }
        }
        System.out.println("First Maximum is :"+first_max);
        System.out.println("Second Maximum is :"+second_max);
    }

}

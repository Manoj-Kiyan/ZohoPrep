package zohoPrep;

import java.util.ArrayList;
public class q2_ladderArr {
    public static void main(String[] args) {
        
        int[] arr={16,17,4,3,5,2};
        rightLadder(arr);
        leftLadder(arr);   
    }
    public static void rightLadder(int[] arr){
        ArrayList ans=new ArrayList();
        int max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i] > max){
                max=arr[i];
                ans.add(0,max);
            } 
        }
        System.out.println(ans);

    }
    public static void leftLadder(int[] arr){

        ArrayList ans=new ArrayList();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(max < arr[i]){
                max=arr[i];
                ans.add(max);
            } 
        }
        System.out.println(ans);
    }
    
}


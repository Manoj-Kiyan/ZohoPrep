import java.util.*;
public class q24_find_fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        findFibo(arr);
    }
    public static void findFibo(int[] arr){
        ArrayList ans=new ArrayList();
        for(int num:arr){
            if(fibonacci(num)){
                ans.add(num);
            }
        }
        System.out.println(ans);
    }
    public static boolean fibonacci(int num){
        int a=0,b=1;
        while(a <= num){
            if(num == a) return true;
            int temp=a+b;
            a=b;
            b=temp;
        }
        return false;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class q25_twisted_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={23,15,16,11,39};
        twistedPrime(arr);
    }
    public static void twistedPrime(int[] arr){
         ArrayList ans=new ArrayList();
        for(int num : arr){
            if(isPrime(num) && isPrime(reverseNum(num))){
                ans.add(num);
            }
        }
        System.out.println(ans);

    }
    public static int reverseNum(int num){
        int reversed=0;
        while(num > 0){
            int digit=num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return  reversed;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;      
        if (num == 2) return true;      
        if (num % 2 == 0) return false;   

        for (int i = 3; i * i <= num; i += 2) {  
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

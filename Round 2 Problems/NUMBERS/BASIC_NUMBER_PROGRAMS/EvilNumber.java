//The binary representation contains an EVEN number of 1s.
import java.util.*;
public class EvilNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num=sc.nextInt();
        isEvil(num);
        
    }
    public static void isEvil(int num){
        int temp=num;
        
        int count=0;
        while(temp > 0){
            int sum = temp%2;
            if(sum == 1) count++;
            temp /=2;
        }
        if( count % 2 == 0){
            System.out.println("EVIL NUMBER");
        }else{
            System.out.println("NOT A EVIL NUMBER");
        }
        
    }
}

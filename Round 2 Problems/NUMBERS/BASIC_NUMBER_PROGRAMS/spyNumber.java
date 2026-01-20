import java.util.Scanner;

public class spyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num=sc.nextInt();
         if(isSpy(num)){
            System.out.println("SPY NUMBER");
         }else{
            System.out.println("NOT A SPY NUMBER");
        }  
    }

    public static boolean isSpy(int num){
        int sum = 0, product = 1;
            while(num > 0){
                int digit = num % 10;
                sum += digit;
                product *= digit;
                num /= 10;
            }
        return sum == product;
    }
}

   
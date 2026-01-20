package NUMBERS.BASIC_NUMBER_PROGRAMS;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int numbers=sc.nextInt();
        System.out.println(sumDigits(numbers));
    }

    public static int sumDigits(int numbers){
        int sum=0;
        while(numbers > 0){
            sum += numbers % 10;
            numbers /=10;
        }
        return  sum;
    }
}

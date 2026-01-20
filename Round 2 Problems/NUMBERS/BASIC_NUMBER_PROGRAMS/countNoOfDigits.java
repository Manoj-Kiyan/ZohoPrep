
package NUMBERS.BASIC_NUMBER_PROGRAMS;

import java.util.Scanner;

public class countNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int numbers=sc.nextInt();
        System.out.println(count(numbers));
    }

    public static int count(int numbers){
        int count=0;
        
        while(numbers >0){
            numbers /=10;
            count++;   
        }
        return  count;
    }
}

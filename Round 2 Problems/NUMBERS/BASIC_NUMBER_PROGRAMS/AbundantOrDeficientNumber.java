
// A number is Abundant if:

// Sum of proper divisors > Number
// Sum of proper divisors>Number

// 👉 Proper divisors = all factors excluding the number itself.

import java.util.*;

public class AbundantOrDeficientNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();

        int sum = sumOfProperDivisors(num);

        if (sum > num) {
            System.out.println("NUMBER IS ABUNDANT");
        } else if (sum == num) {
            System.out.println("NUMBER IS PERFECT");
        } else {
            System.out.println("NUMBER IS DEFICIENT");
        }
    }

    public static int sumOfProperDivisors(int num) {
        if (num <= 1) return 0;

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

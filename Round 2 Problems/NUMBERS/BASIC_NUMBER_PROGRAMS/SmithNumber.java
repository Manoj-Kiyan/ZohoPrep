// A Smith Number is:

// Composite number (NOT prime)

// Sum of digits of the number

// Sum of digits of its prime factors (counted with repetition)
import java.util.*;

public class SmithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSmith(num)) {
            System.out.println(num + " is a SMITH number");
        } else {
            System.out.println(num + " is NOT a Smith number");
        }
    }

    public static boolean isSmith(int num) {
        if (isPrime(num)) return false;  

        int sumDigits = sumDigit(num);
        int sumFactors = 0;
        int temp = num;

        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {    
                sumFactors += sumDigit(i);
                temp /= i;
            }
        }

        return sumFactors == sumDigits;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

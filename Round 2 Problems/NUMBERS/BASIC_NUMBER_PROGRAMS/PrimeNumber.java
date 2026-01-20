import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = checkPrime(num);

        if (isPrime) {
            System.out.println(num + " is a PRIME number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

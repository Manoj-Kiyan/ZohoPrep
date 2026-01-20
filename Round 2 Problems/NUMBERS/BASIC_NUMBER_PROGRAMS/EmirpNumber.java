// An Emirp number is a number that:

// Is PRIME

// Its reverse is also PRIME

// The number and its reverse are NOT the same.
import java.util.*;

public class EmirpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEmirp(num)) {
            System.out.println(num + " is an EMIRP number");
        } else {
            System.out.println(num + " is NOT an Emirp number");
        }
    }

    public static boolean isEmirp(int num) {
        if (!isPrime(num)) return false;

        int rev = reverse(num);

        if (num == rev) return false;   // palindrome prime not allowed

        return isPrime(rev);
    }

    // Prime check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Reverse number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}

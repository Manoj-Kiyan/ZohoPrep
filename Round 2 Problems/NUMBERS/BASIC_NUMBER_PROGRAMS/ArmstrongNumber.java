import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;

       
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

       
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an ARMSTRONG number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }


    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
}

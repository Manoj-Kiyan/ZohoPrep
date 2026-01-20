import java.util.*;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1;

        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }
}

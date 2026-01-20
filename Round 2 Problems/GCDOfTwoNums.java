import java.util.*;

public class GCDOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = sc.nextInt();

        GCD(num1, num2);
    }

    public static void GCD(int num1, int num2) {

        System.out.print("\nFactors of " + num1 + ": ");
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nFactors of " + num2 + ": ");
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                System.out.print(i + " ");
            }
        }

        int ans = findGCD(num1, num2);
        System.out.println("\n\nGCD (Greatest Common Factor): " + ans);

        
        System.out.println("Common Factors:");
        for (int i = 1; i <= ans; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nLargest Common Factor = " + ans);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

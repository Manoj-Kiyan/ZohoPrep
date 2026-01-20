import java.util.*;
    public class SwapNumberWithoutThird {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Before Swapping:");
            System.out.println("a = " + a + ", b = " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swapping:");
            System.out.println("a = " + a + ", b = " + b);
    }
}

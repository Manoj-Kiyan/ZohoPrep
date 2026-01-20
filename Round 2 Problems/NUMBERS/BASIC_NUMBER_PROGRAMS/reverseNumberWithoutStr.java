import java.util.*;
public class reverseNumberWithoutStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number = " + rev);
    }
}

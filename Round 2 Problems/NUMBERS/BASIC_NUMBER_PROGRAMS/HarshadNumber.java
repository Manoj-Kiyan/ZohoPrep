import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHarshad(num)) {
            System.out.println(num + " is a HARSHAD number");
        } else {
            System.out.println(num + " is NOT a Harshad number");
        }
    }

    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return num % sum == 0;
    }
}

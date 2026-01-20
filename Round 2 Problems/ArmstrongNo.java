import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = in.nextInt();
        int result = ArmsNo(num);
        System.out.println("The sum is " + result);
    }

    public static int ArmsNo(int ins) {
        int digits = 0;
        int temp = ins;
        int sum = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = ins;

        
        while (temp > 0) {
            int rem = temp % 10;

        
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= rem;
            }

            sum += power;
            temp /= 100;
        }

        if (sum == ins) {
            System.out.println("The given Number " + ins + " is an Armstrong Number");
        } else {
            System.out.println("The given Number " + ins + " is NOT an Armstrong Number");
        }

        return sum;
    }
}

import java.util.*;
class HappyNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        System.out.println(isHappy1(num));
        System.out.println(isHappy2(num));
    }


    public static boolean isHappy1(int n){
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {                
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;                        
            if (seen.contains(n)) {         
                return false;
            }
            seen.add(n);                    
        }
        return true;                        

    }
    
    public static boolean isHappy2(int n) {
        int slow = n, fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int squareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d * d;
            num /= 10;
        }
        return sum;
    }


}

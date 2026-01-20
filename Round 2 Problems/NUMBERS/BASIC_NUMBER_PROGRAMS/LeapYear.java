
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year=sc.nextInt();
        System.out.println(isLeap(year));
    }
    public static boolean isLeap(int year){
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }
}

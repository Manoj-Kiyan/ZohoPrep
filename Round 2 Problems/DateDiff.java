
import java.util.Arrays;
import java.util.Scanner;

public class DateDiff {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int[] date1={10,2,2004};
        int[] date2={10,3,2006};
        
        // System.out.println("Enter Date one :");
        // int[] date1=sc.next();
        // System.out.println("Enter Date two :");
        // int[] date2=sc.next();
        // sc.nextLine();

        System.out.println("The  Number of days between " + Arrays.toString(date1) +" to "+ Arrays.toString(date2) +" is :"+calculateDayDiff(date1,date2));
    }

    public static int calculateDayDiff(int[] date1,int[] date2){
        return Math.abs(convertToDays(date1)-convertToDays(date2));
    }

    public static int convertToDays(int[] date){
        int day=date[0];
        int month=date[1];
        int year=date[2];

        int totalDays=day;

        for (int y = 1; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        for (int m = 1; m < month; m++) {
            totalDays+=daysinMonth(m,year);   
        }
        return totalDays;
    }
     public static int daysinMonth(int month,int year){
            switch(month){
                case 1: case 3: case 5: case 7:case 8: case 10:case 12: return 31;
                case 4: case 6: case 9: case 11: return 31;
                case 2: return  isLeapYear(year) ? 29 : 28;
                default: return 0;
            }
    }


    public static boolean isLeapYear(int year){
            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ));
    }
}

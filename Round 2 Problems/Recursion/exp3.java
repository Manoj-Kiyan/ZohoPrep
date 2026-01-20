
import java.util.Scanner;

public class exp3{
    static  Scanner sc=new Scanner(System.in);
    static int count=sc.nextInt();
    public static void main(String[] args) {
        System.out.println("START");
        int num=sc.nextInt();
        printTables(num);
        System.out.println("END");
    }
    public static void printTables(int num){
        if(count <=10){
             System.out.println(count+" * "+num+" = "+(num * count));
             count++;
             printTables(num);
        }
       
    }
}
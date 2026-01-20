
import java.util.Scanner;

public class exp2{
    static  Scanner sc=new Scanner(System.in);
    static int count=sc.nextInt();
    public static void main(String[] args) {
        System.out.println("START");
        display();
        System.out.println("END");
    }
    public static void display(){
        if(count <= 5){
            System.out.println("HTML");
            count++;
            display();
            return;
        }
    }
}
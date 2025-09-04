
import java.util.Scanner;

public class MultiArraySum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Arrays to print : ");
        int numofArrays=sc.nextInt();
        sc.nextLine();
        int totalSum=0;
        for (int i = 0; i < numofArrays; i++) {
            System.out.println("Enter the Arrays"+ i);
            String line=sc.nextLine();
            String[] strArr=line.split(" ");
            long num=CovertArrToNum(strArr);
            totalSum+=num;
           
        }
         System.out.println("TotalSum of all Arrays : "+totalSum);
         sc.close();
    }
    public static long CovertArrToNum(String[] strArr){
        int number=0;
        for (String string : strArr) {
            number+=number*10+Integer.parseInt(string);
        }
        return number;
    }
    
}

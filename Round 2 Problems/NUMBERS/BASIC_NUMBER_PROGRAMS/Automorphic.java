import java.util.Scanner;

public class Automorphic {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int num= sc.nextInt();
       boolean ans=morphic(num);
        morphicStr(num);
       System.out.println("FINAL ANSWER IS  : " +ans);
      
    }

    public static void  morphicStr(int num){
        int sq=num * num;
        String nums=String.valueOf(num);
        String squares=String.valueOf(sq);

        if(squares.endsWith(nums)){
            System.out.println("The Given String is Automorphic");
        }else{
            System.out.println("The Given String is Not Automorphic");
        }
    }

    public static boolean morphic(int num){
        int temp = num;
        int digits=0;
        int sq=num * num;
        while(temp > 0){
            digits++;
            temp /=10;
        }
        int endDigits = sq % (int) Math.pow(10, digits);
        return endDigits == num;

    }
}

import java.util.Scanner;

public class oddOrEvenWithoutModulus {  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int numbers=sc.nextInt();
        oddEven(numbers);
    }

    public static void oddEven(int numbers){
        int num = numbers;

        if((num / 2) * 2 == num){
            System.out.println("The number is Even ");
        }else{
            System.out.println("The number is Odd");
        }

    }
}

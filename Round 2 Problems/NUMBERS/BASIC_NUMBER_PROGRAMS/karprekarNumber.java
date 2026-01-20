import java.util.*;
public class karprekarNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(isKarprekar(num)) System.out.println("NUMBER IS KARPREKAR");
        else System.out.println("NOT A KARPREKAR NUMBER");
    }
    public static boolean isKarprekar(int num){
        if(num == 1) return true;
        long sq=(long) num * num;
        String str=String.valueOf(sq);
        for (int i = 1; i < str.length(); i++) {
            String left=str.substring(0,i);
            String right=str.substring(i);

            int leftNum=Integer.parseInt(left);
            int rightNum=Integer.parseInt(right);

            if(rightNum > 0 && (leftNum+rightNum) == num) return true;
        }
        return false;
        

    }

}

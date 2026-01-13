import java.util.*;
public class q20_Expression_Validity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Math Expression :");
        String exp=sc.nextLine();
        if(checkExp(exp)) System.out.println("The Given Expression is Valid . . .");
        else System.out.println("The Given Expression is InValid . . .");

    }//(a+b) (ab+)
    public static boolean checkExp(String str){
        Stack<Character> stack=new Stack<>();
        char prevChar=' ';
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch == '(') stack.push(ch);
            else if(ch == ')'){
                if(stack.isEmpty()) return false;
                if(prevChar =='+' || prevChar =='-' || prevChar =='*' || prevChar =='/') return false;
                stack.pop();
            }
            
            if(ch=='+'|| ch=='-'|| ch=='*'|| ch=='/'|| ch=='%' || ch ==' '){
                if(prevChar =='+' || prevChar =='-' || prevChar =='*' || prevChar =='/') return false;
            }
            prevChar=ch;
        }

        return stack.isEmpty() && !(prevChar =='+' || prevChar =='-' || prevChar =='*' || prevChar =='/');
    }
}

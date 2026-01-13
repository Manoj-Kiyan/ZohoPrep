import java.util.*;
public class q21_unbalance_paranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Math Expression :");
        String exp=sc.nextLine();
        String ans=isValid(exp);
        System.out.println(ans);
    }
    public static String isValid(String str){
        Set<Integer> set=new HashSet<>();
        StringBuilder result=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else if(ch == ')'){
                if(stack.isEmpty()) set.add(i);
                else    stack.pop();
            }
        }
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        for (int i = 0; i < str.length(); i++) {
            if(!set.contains(i)){
                result.append(str.charAt(i));
            }
        }
        
        return result.toString();
    }
}

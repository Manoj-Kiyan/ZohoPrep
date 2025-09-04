

public class Palindrome {
    public static void main(String[] args) {
        String Name="madam";
        int num=2316;
        Palin(Name);
        boolean result=palin(Name);
        System.out.println(" The Given String "+Name+" is Palindrome and the result is "+result);
        boolean result2=PalinNo(num);
        System.out.println(" The Given Number "+num+ " result is "+result2);
        
    }
    public static void Palin(String in){
        int left=0;
        int right=in.length()-1;
        String reversed="";
        for (int i = right; i >= left; i--) {
           reversed+=in.charAt(i);
        }
        if(in.equals(reversed)){
            System.out.println("The give String "+in+" palindrome");
        }else{
                    System.out.println("Not Palindrome");
        }

    }

    public static boolean palin(String in){
        int left=0;
        int right=in.length()-1;
        boolean ispalin=true;
        while(left<right){
            if(in.charAt(left)!=in.charAt(right)){
                ispalin= false;
                break;
            }
            left++;
            right--;
          
        }
      return ispalin;
     
    }
//121
    public static boolean  PalinNo(int in){
        int n=in;
        int reversed=0;

        while(n>0){
            int rem=n%10;
            reversed= reversed  *10 + rem;
            n/=10;
        }
        return reversed==n;
    }

}

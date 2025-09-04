public class PseudoBin {
    public static void main(String[] args) {
        int num1=23;
        int num2=16;
        int num3=11;
        int num4=2004;

        System.out.println("The Shortest Binary Sum Count is "+ PseudoBinarySum(num1));
        System.out.println("The Shortest Binary Sum of " + num2 +" Count is "+ PseudoBinary(num2));
        // System.out.println(PseudoBinarySum(num3));
        // System.out.println(PseudoBinarySum(num4));
        
    }

    //Time Complexcity : n(logn)
    public static int PseudoBinarySum(int num1){
        int num=num1;
        int count=0;
        while(num1 > 0){

            int temp=num1;
            int pseudo=0;
            int product=1;
            while(temp > 0){
                int digit=temp%10;
                if(digit > 0){
                    pseudo +=product;
                }
                temp /=10;
                product*=10;
            }
            
            num1 -=pseudo;
            
            count++;
            System.out.print(pseudo +"  ");
        }
        System.out.println(" = "+num);
        return count;
    }

    //Time Complexcity : log(n)
    public static int PseudoBinary(int n){
        int maxLen=0;
        while(n > 0){
            int digit=n % 10;
            maxLen=Math.max( digit,maxLen);   
            n /=10;    
        }
        return maxLen;

    }

}

public class NumPresentNum {
    public static void main(String[] args) {
        int num1=2316;
        int num2=814802316;
        //isPresent1(num1,num2);
        isPresent(num1,num2);

        if(isPresent1(num1, num2)){
            System.out.println(num1+" is Present in "+num2);
        }
        else{
            System.out.println(num1+" is Not Present in "+num2);
        }
    }
    public static boolean isPresent1(int num1,int num2){
        String str1=String.valueOf(num1);
        String str2=String.valueOf(num2);

        return  str2.contains(str1);

    }

     public static boolean isPresent(int num1,int num2){
        int len=getLen(num1);
        int pow=(int)Math.pow(10, len);

        while(num1<num2){
            int lastdigits=num2%pow;

            if(isSame(num1,lastdigits)){
                return true;
            }
            num2/=10;
        }
        return false;
     }
     public static boolean isSame(int a,int b){
        if(a>0 && b>0){
            if(a%10 != b%10) return false;
            a/=10;
            b/=10;
        }
        return true;
     }

    private static int getLen(int num1) {
        int len=0;
        while(num1>0){
            len++;
            num1/=10;
        }
        return len;
    }
}

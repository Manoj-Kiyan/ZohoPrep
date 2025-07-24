public class SwapTwoNum {
    public static void main(String[] args) {
        Swap(23,16);
    }

    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After SWap Two Numbers"+a+""+b);
    }
    
}
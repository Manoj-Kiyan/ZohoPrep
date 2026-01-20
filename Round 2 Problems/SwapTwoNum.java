public class SwapTwoNum {
    public static void main(String[] args) {
        Swap(23,16);
    }

    public static void Swap(int a,int b){
        // int temp=a;
        // a=b;
        // b=temp;
        a=a+b - (b=a);

        System.out.println("After SWap Two Numbers :");
        System.out.println("A is :"+ a);
        System.out.println("B is :"+ b);
    }
    
}
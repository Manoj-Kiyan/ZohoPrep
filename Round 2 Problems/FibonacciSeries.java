public class FibonacciSeries {
    public static void main(String[] args) {
        int num=20;
        Fibonacci(num);
    }
    public static void Fibonacci(int n){
        int a=0;
        int b=1;
        int c;
        System.out.print(a+"\n"+b+"\n");
        for (int i = 0; i <= n; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }

    }
}

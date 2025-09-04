public class FibonacciSeries {
    public static void main(String[] args) {
        int num=20;
        Fibonacci(num);
    }
    public static void Fibonacci(int n){
        int a=0;
        int b=1;
        int c=1;
        
        for (int i = 0; i <= n; i++) {
            
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
            
        }

    }
}

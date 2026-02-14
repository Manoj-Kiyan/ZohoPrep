package Qspiders.Methods;

public class OrderofExe {
    public static void main(String[] args) {
        System.out.println("HI FROM MAIN METHOD !");
        call();
        System.out.println("BYE FROM MAIN METHOD");
    }

    public static void call(){
        System.out.println("HI FROM CALL METHOD");
    }
}
 /*
 ORDER OF EXECUTION :
 JAVA --> LINE BY LINE EXECUTION OCCURS.
 */
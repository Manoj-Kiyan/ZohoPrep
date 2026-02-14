package Qspiders;

import java.util.Scanner;

public class courseSelectionUI {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
       do { 
            System.out.println(" ---------------------");
            System.out.println("| COURSE SELECTION UI |");
            System.out.println(" ---------------------");
            System.out.println("\n 1.Java \n 2.Python \n 3.SQL \n 4.Web Development \n 5.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1 -> System.out.println("Java is Obeject Oriented Programing language ");
                case 2 -> System.out.println("Python is Easier Programing language ");
                case 3 -> System.out.println("SQL is query language used for DB");
                case 4 ->System.out.println("Web Development is creating web pages by using Frontend Languages");
                case 5 -> System.out.println("Exit ...");            
            }
       } while (choice !=5);    
       
    sc.close();
    }
    
}

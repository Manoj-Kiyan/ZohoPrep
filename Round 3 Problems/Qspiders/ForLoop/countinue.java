package Qspiders.ForLoop;

//Continue is keyword 

import java.util.Scanner;

//It used skip the iteration
public class countinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  :");
        int n=sc.nextInt();
        for (int i = 1; i < n; i++) {
           while(i != n){
            System.out.println(i+" ");
            i++;
             if(i % 2 == 0){
               continue; 
             }
               
           } 
           
         
            if(i % 2 != 0){
                break;
            }
            System.out.println(i+" ");
            
        }
    }
}

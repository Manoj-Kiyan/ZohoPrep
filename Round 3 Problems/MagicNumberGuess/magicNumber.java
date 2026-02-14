package MagicNumberGuess;

import java.util.Scanner;

public class magicNumber {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int sys_num = (int) (Math.random() * 100);
        //System.out.println(sys_num);
        boolean isgame=true;
        int attempts=5;

        do { 
            System.out.println("---------------");
            System.out.println("| MAGIC NUMBER |");
            System.out.println("---------------");
            System.out.println("Enter the User_guess :");
            int user_guess=sc.nextInt();
            attempts--;
            if(sys_num < user_guess){
                System.out.println("Number is High ! Try Next  Small Number... Remaining Attempts left : " + attempts);
            }else if(sys_num > user_guess){
                 System.out.println("Number is Low ! Try Next Large Number... Remaining Attempts left : " + attempts);
            }else{
                System.out.println("***Conguralations You Find The Magic Number***");
                System.out.println("The Magic Number is : "+sys_num);
            }
            System.out.println("Attempts left : "+attempts);
            if(attempts == 0){
                System.out.println("Out of Attempts Left , Try After Some Time ... ");
                System.out.println("The Magic Number is : "+sys_num);
                System.out.println(" 1.Continue \n 2.Break ");
                int n=sc.nextInt();
                switch (n) {
                    case 1:
                        attempts=5;
                        sys_num=(int) (Math.random()*100);
                        System.out.println("Game Restarted... ! Try Again");
                        break;
                    case 2:
                        isgame=false;
                        System.out.println("Game Over ! Bye ...");
                        break;
                    default:
                       System.out.println("Invalid Attempt !");
                       isgame=false;
                }
            }
        } while (isgame);

        sc.close();
    }
    
}

package Qspiders;

import java.util.*;


public class ModifyPin {
    static Scanner sc=new Scanner(System.in);
     static long reg_ph=987654321;
    public static void main(String[] args) throws InterruptedException  {
       
         System.out.println(" ---------------------");
         System.out.println("|  MODIFICATION PAGE  |");
         System.out.println(" ---------------------");
         System.out.println("1. ATM PIN ");
         System.out.println("2. MOBILE PIN ");
         System.out.println("3. INSTA PIN ");
         System.out.println("4. EXIT ");
         System.out.println("\tSELECT HERE : ");
         int input=sc.nextInt();

         switch (input) {
            case 1:
                verifyPin("ATM");
                break;
            case 2:
                verifyPin("MOBILE");
                break;
            case 3:
                verifyPin("INSTA");
                break;
            case 4:
                System.out.println("Exiting... Bye!");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
    public static void verifyPin(String type) throws InterruptedException{
           
            boolean isNumberVerified=false;
            while(!isNumberVerified){
                 System.out.println("\t\t\t Redirecting to "+ type +" Page . . .");
                 Thread.sleep(3000);
                 System.out.println("Enter Registered Mobile Number :");
                long user_ph=sc.nextLong();
                if(reg_ph == user_ph){

                boolean isVerified=false;
                while(!isVerified){
                    int sys_otp=(int) (Math.random()*9999+1000);
                System.out.println("Enter the OTP ...");
                Thread.sleep(3000);
                System.out.println(sys_otp);
                System.out.println("Enter here : ");
                int otp=sc.nextInt();
                if(otp==sys_otp){
                    System.out.println("Create a new "+type+" PIN ");
                    int new_pin=sc.nextInt();
                    System.out.println("Updating . . .");
                    Thread.sleep(3000);
                    System.out.println(type +" PIN UPDATED !");
                    isVerified=true;
                    isNumberVerified=true;
                }else{
                    System.out.println("Verification Failed Entered OTP is Wrong");
                    System.out.println("Try Again (y) OR Exit (n) :");
                    char ch=sc.next().charAt(0);

                    if(ch == 'y' || ch == 'Y'){
                        System.out.println("Restarting OTP Verification Process . . . ");

                    }else{
                        System.out.println("Exiting...");
                            break;   
                    }
                }

                }    

            }else{
                System.out.println("Mismatch Number Can't Modify the " +type+" PIN . . . ");
                System.out.println("Try Again (y) OR Exit (n) :");
                char ch=sc.next().charAt(0);
                   if (ch == 'y' || ch == 'Y') {
                        System.out.println("Restarting Mobile Number Verification...");
                      
                    } else {
                        System.out.println("Exiting...");
                        break;
                    }
            }

            }
            
         
    }
       


 }


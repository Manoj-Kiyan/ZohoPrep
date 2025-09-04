import java.util.*;
public class TaskManagement {
    public static void main(String[] args) {
        Management taskManager=new Management();
        System.out.println("Welcome to task management System");
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("\n1.Task Name  \n2.View Task \n3.View priority Task List  \n0.Exit");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.viewTask();
                    break;
                case 3:
                    taskManager.ViewPriorityTask();
                    break;
                case 0:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid Choice ! Try Again ...");
            }
        }
        // sc.close(); // Don't close Scanner tied to System.in in static context
    }


}

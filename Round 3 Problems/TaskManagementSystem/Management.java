import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Management {
    Scanner sc = new Scanner(System.in);
    private Map<Integer,Task> tasks=new HashMap<>();
    int idCounter=0;
    public void addTask() {
        System.out.println("Enter Task Name: ");
        String tName=sc.nextLine();
        System.out.println("Enter Task Description: ");
        String tDescription=sc.next();
        Date dueDate=null;
        while(dueDate == null) {
            dueDate=getDate();    
        }
        
        tasks.put(idCounter++,new Task(idCounter, tName, tDescription, dueDate));
        System.out.println("Task Added Succesfully!");
    }

   public void viewTask() {
    System.out.printf("%-5s %-15s %-25s %-12s%n", "ID", "Task Name", "Description", "Due Date");
    System.out.println("---------------------------------------------------------------");

    for (Map.Entry<Integer, Task> task : tasks.entrySet()) {
        System.out.printf("%-5d %-15s %-25s %-12s%n",
                task.getKey(),
                task.getValue().getTaskName(),
                task.getValue().getTaskDescription(),
                datetoString(task.getValue().getDueDate())
        );
    }
}

    private String datetoString(Date dueDate){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        return  dateFormat.format(dueDate);

    }

    public void ViewPriorityTask() {
        System.out.println("ViewPriorityTask() called (stub)");
    }


       public Date getDate(){
        System.out.println("Enter Due Date (dd-MM-yyyy): ");
        String Sdate=sc.nextLine();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date=dateFormat.parse(Sdate);
            if(date.before(new Date())){
                System.out.println("Enter date after present date");
                return null;
            }
            return date;
        } catch (ParseException e) {
            System.out.println("Invalid Date!");
        }
        return null;
        
    }

}

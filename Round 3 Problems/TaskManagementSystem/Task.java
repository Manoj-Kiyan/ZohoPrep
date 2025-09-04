import java.util.Date;
public class Task {

    private final int id;
    private String taskName;
    private String taskDescription;
    private Date dueDate;

    public Task(int id,String taskName,String taskDescription,Date date){
        this.id=id;
        this.taskName=taskName;
        this.taskDescription=taskDescription;
        dueDate=date;
    }

    public String getTaskName(){
        return taskName;
    }
    public String getTaskDescription(){
        return taskDescription;
    }

    public Date getDueDate(){
        return dueDate;
    }
}

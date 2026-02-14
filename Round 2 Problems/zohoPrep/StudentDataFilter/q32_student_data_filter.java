package StudentDataFilter;
import java.util.*;
public class q32_student_data_filter {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        char choice;
        do{
            System.out.println("Enter the roll Number : ");
            int rollNo=sc.nextInt();
            System.out.println("Enter the markA Number : ");
            int markA=sc.nextInt();
            System.out.println("Enter the markB Number : ");
            int markB=sc.nextInt();
            System.out.println("Enter the markC Number : ");
            int markC=sc.nextInt();

        
            Student s1=new Student(rollNo,markA,markB,markC);
            students.add(s1);

            System.out.println("Add Another Student ? (y/n) ");
            choice=sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        System.out.println("\n--- Entered Students ---");

        for(Student s : students){
            System.out.println(s.rollNo+" "+s.markA+" "+s.markB+" "+s.markC);
        }

        sc.nextLine();
        System.out.println("Enter the field to print :");
        String fielToPrint = sc.nextLine().trim();
        sc.nextLine();
        System.out.println("Enter the condition : ex : mark > value");
        String condition = sc.nextLine().trim();
        char conditionField=condition.charAt(0);
        char operator=condition.charAt(2);
        int value = Integer.parseInt(condition.substring(4).trim());

        for(Student student : students){

            boolean conditionMet = false;

            switch(conditionField){
                case 'A': 
                    conditionMet=student.evaluateCondition(student.markA,operator,value);
                    break;
                case 'B':
                    conditionMet=student.evaluateCondition(student.markB,operator,value);
                    break;
                case 'C':
                    conditionMet=student.evaluateCondition(student.markC,operator,value);
                    break;
            }

            if(conditionMet){
                switch (fielToPrint) {
                    case "*":
                        System.out.println(student.rollNo +" "+student.markA +" "+student.markB +" "+student.markC);
                        break;
                    case "A":
                        System.out.println(student.markA);
                        break;
                    case "B":
                        System.out.println(student.markB);
                        break;
                    case "C":
                        System.out.println(student.markC);
                        break;
                    default:
                        System.out.println("INVALID ...");
                }
            }
            
        }




    }
}

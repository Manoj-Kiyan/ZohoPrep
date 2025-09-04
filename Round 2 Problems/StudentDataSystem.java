import java.util.*;

class StudentData {
    int rollNo;
    int markA;
    int markB;
    int markC;

    public StudentData(int rollNo,int markA,int markB,int markC){
        this.rollNo=rollNo;
        this.markA=markA;
        this.markB=markB;
        this.markC=markC;
    }
    
}

public class StudentDataSystem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<StudentData> students=new ArrayList<>();
        students.add(new StudentData(1, 56, 67, 89));
        students.add(new StudentData(2, 89, 54, 90));
        students.add(new StudentData(3, 69, 72, 83));

        System.out.println("Enter the Flied to print : ");
        String FieldToPrint=sc.nextLine().trim();
        System.out.println("Enter the Condition : ");
        String Condition=sc.nextLine().trim();

        char ConditionField = Condition.charAt(0);
        char operator=Condition.charAt(1);
        int value=Integer.parseInt(Condition.substring(2).trim());

        for(StudentData student : students){

            boolean ConditionMet=false;
            switch (ConditionField) {
                case 'A':
                    ConditionMet=evaluateCondition(student.markA,operator,value);
                    break;
                case 'B':
                    ConditionMet=evaluateCondition(student.markB,operator,value);
                    break;
                case 'C':
                    ConditionMet=evaluateCondition(student.markC,operator,value);
                    break;
            }
            if(ConditionMet){
                switch (FieldToPrint) {
                    case "*":
                        System.out.println(student.rollNo+" "+student.markA+" "+student.markB+" "+student.markC);
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
                
                }
            }
        }
        
    }
    

    public static boolean evaluateCondition(int FieldValue, char operator, int value) {
        switch (operator) {
            case '<':
                return FieldValue < value; 
            case '>':
                return FieldValue > value;
            case '=':
                return FieldValue == value;
            default:
               return false;
        }
        
    }
    



}

import java.util.*;

public class StudentsData {
    int rollNo;
    int markA;
    int markB;
    int markC;

    public StudentsData(int rollNo, int markA, int markB, int markC) {
        this.rollNo = rollNo;
        this.markA = markA;
        this.markB = markB;
        this.markC = markC;
    }
}
class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentsData> students = new ArrayList<>();
        students.add(new StudentsData(52, 90, 80, 70));
        students.add(new StudentsData(53, 95, 92, 85));
        students.add(new StudentsData(54, 98, 88, 79));

        System.out.print("Enter the Field to print (A/B/C/*): ");
        String fieldToPrint = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter the Condition (e.g., A>90): ");
        String condition = sc.nextLine().trim().toUpperCase();

        if (condition.length() < 3) {
            System.out.println("Invalid condition format.");
            return;
        }

        char conditionField = condition.charAt(0);
        char operator = condition.charAt(1);
        int value;

        try {
            value = Integer.parseInt(condition.substring(2).trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric value in condition.");
            return;
        }

        for (StudentsData student : students) {
            boolean conditionMet = false;

            switch (conditionField) {
                case 'A':
                    conditionMet = evaluateCondition(student.markA, operator, value);
                    break;
                case 'B':
                    conditionMet = evaluateCondition(student.markB, operator, value);
                    break;
                case 'C':
                    conditionMet = evaluateCondition(student.markC, operator, value);
                    break;
                default:
                    System.out.println("Invalid condition field: " + conditionField);
                    return;
            }

            if (conditionMet) {
                switch (fieldToPrint) {
                    case "*":
                        System.out.printf("RollNo: %d | A: %d | B: %d | C: %d%n",
                                student.rollNo, student.markA, student.markB, student.markC);
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
                        System.out.println("Invalid field to print: " + fieldToPrint);
                        return;
                }
            }
        }
    }

    public static boolean evaluateCondition(int mark, char operator, int value) {
        switch (operator) {
            case '<':
                return mark < value;
            case '>':
                return mark > value;
            case '=':
                return mark == value;
            default:
                System.out.println("Invalid operator: " + operator);
                return false;
        }
    }
}

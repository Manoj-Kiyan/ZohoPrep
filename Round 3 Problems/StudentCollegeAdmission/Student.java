import java.time.LocalDate;

public class Student {
    String studentId;
    String studentName;
    String fatherName;
    LocalDate dob;
    Gender gender;
    String emailId;
    int physics, chemistry, maths;

    public Student(String studentId, String studentName, String fatherName,
                   LocalDate dob, Gender gender, String emailId,
                   int physics, int chemistry, int maths) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.dob = dob;
        this.gender = gender;
        this.emailId = emailId;
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    public double getAverage() {
        return (physics + chemistry + maths) / 3.0;
    }

    @Override
    public String toString() {
        return studentId + " - " + studentName + " (" + gender + ")";
    }
}

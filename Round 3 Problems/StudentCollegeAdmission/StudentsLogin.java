import java.util.*;

public class StudentsLogin {
    private static List<Student> students = new ArrayList<>();

    public static void add(Student s) {
        students.add(s);
    }

    public static Student findById(String id) {
        for (Student s : students) {
            if (s.studentId.equalsIgnoreCase(id)) return s;
        }
        return null;
    }

    public static List<Student> getAll() {
        return students;
    }
}

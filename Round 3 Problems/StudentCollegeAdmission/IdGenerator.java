public class IdGenerator {
    private static int studentCounter = 100;
    public static String nextStudentId() {
        return "S" + (studentCounter++);
    }
}

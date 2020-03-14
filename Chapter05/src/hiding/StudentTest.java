package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        //studentLee.studentName = "배현호";
        studentLee.setStudentName("배현호");

        System.out.println(studentLee.getStudentName());
    }
}
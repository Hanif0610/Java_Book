package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        //studentLee.studentName = "����ȣ";
        studentLee.setStudentName("����ȣ");

        System.out.println(studentLee.getStudentName());
    }
}
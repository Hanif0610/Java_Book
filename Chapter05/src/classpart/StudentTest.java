package classpart;

public class StudentTest {
    public static void main(String[] args) {
    	Student std1 = new Student();
        std1.studentName = "�ϴ���";
        System.out.println(std1.getStudentName());

        Student std2 = new Student();
        std2.studentName = "�귣��";
        System.out.println(std2.getStudentName());
    }
}
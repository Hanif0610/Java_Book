package classpart;

public class StudentTest2 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.studentName = "�ϴ���";

        Student std2 = new Student();
        std2.studentName = "�귣��";

        System.out.println(std1); //std1�� std2�� ���� ����Ű�� ���� ���� ���� ���
        System.out.println(std2);
    }
}
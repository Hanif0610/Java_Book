package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("������");
        System.out.println(studentLee.serialNum);   //serialNum ���� �ʱⰪ ���
        studentLee.serialNum++; //static ���� �� ����

        Student studentSon = new Student();
        studentSon.setStudentName("�ռ���");
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.serialNum);
    }
}
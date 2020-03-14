package object;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId + "," + studentName;
    }
    
    @Override
    public int hashCode() {
        return studentId;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(this.studentId == std.studentId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "�̻��");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "�̻��");

        if(studentLee == studentLee2) {
            System.out.println("studnetLee�� studnetLee2�� �ּҴ� ����.");
        } else {
            System.out.println("studnetLee�� studnetLee2�� �ּҴ� �ٸ���.");
        }

        if(studentLee.equals(studentLee2)) {
            System.out.println("studnetLee�� studnetLee2�� �����ϴ�.");
        } else {
            System.out.println("studnetLee�� studnetLee2�� �������� �ʴ�.");
        }

        if(studentLee == studentSang) {
            System.out.println("studnetLee�� studentSang�� �ּҴ� ����.");
        } else {
            System.out.println("studnetLee�� studentSang�� �ּҴ� �ٸ���.");
        }

        if(studentLee.equals(studentSang)) {
            System.out.println("studnetLee�� studentSang�� �����ϴ�.");
        } else {
            System.out.println("studnetLee�� studentSang�� �������� �ʴ�.");
        }
        System.out.println("studentLee�� hashCode : " + studentLee.hashCode());
        System.out.println("studentSang�� hashCode : " + studentLee.hashCode());

        System.out.println("studentLee�� ���� �ּҰ� : " + System.identityHashCode(studentLee));
        System.out.println("studentLee�� ���� �ּҰ� : " + System.identityHashCode(studentSang));
    }
}
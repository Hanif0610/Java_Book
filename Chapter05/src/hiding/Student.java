package hiding;

public class Student {
    int studenID;
    private String studentName; //studentName������ private�� ����
    int grade;
    String address;

    //private ������ studentName�� ������ ���� ������
    public String getStudentName() {
        return studentName;
    }

    //private ������ studentName�� ������ ���� ������
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
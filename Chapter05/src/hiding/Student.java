package hiding;

public class Student {
    int studenID;
    private String studentName; //studentName변수를 private로 선언
    int grade;
    String address;

    //private 변수인 studentName에 접근해 값을 가져옴
    public String getStudentName() {
        return studentName;
    }

    //private 변수인 studentName에 접근해 값을 지정함
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
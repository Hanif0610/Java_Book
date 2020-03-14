package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;
    
    public String getStudentName() { //메서드
        return studentName;
    }

    public void setStudentName(String name) { //메서드
        studentName = name;
    }

    public void showStudentInfo() {                      //메서드 추가
        System.out.println(studentName + "," + address); //이름, 주소 출력
    }
}
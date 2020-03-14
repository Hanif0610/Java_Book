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
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2) {
            System.out.println("studnetLee와 studnetLee2의 주소는 같다.");
        } else {
            System.out.println("studnetLee와 studnetLee2의 주소는 다르다.");
        }

        if(studentLee.equals(studentLee2)) {
            System.out.println("studnetLee와 studnetLee2는 동일하다.");
        } else {
            System.out.println("studnetLee와 studnetLee2는 동일하지 않다.");
        }

        if(studentLee == studentSang) {
            System.out.println("studnetLee와 studentSang의 주소는 같다.");
        } else {
            System.out.println("studnetLee와 studentSang의 주소는 다르다.");
        }

        if(studentLee.equals(studentSang)) {
            System.out.println("studnetLee와 studentSang는 동일하다.");
        } else {
            System.out.println("studnetLee와 studentSang는 동일하지 않다.");
        }
        System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
        System.out.println("studentSang의 hashCode : " + studentLee.hashCode());

        System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
        System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentSang));
    }
}
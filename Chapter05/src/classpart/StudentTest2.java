package classpart;

public class StudentTest2 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.studentName = "하니프";

        Student std2 = new Student();
        std2.studentName = "브랜드";

        System.out.println(std1); //std1과 std2가 각각 가리키는 참조 변수 값을 출력
        System.out.println(std2);
    }
}
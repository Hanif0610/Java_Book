package constructor;

class Person {
    String name;
    float height;
    float weight;

    public Person() {} //디폴트 생성자

    public Person(String pname) { //이름을 매개변수로 받는 생성자
        name = pname;
    }
    //이름, 키, 몸무게를 매개변수로 받는 생성자
    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        //디폴트 생성자로 클래스 생성 후 인스턴스 변수 값을 따로 초기화
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        //인스턴스 변수 초기화와 동시에 클래스 생성
        Person personLee = new Person("이순신", 175, 75);
        System.out.println(personLee.name + "," + personLee.height + "," + personLee.weight);
    }
}
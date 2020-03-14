package constructor;

class Person {
    String name;
    float height;
    float weight;

    public Person() {} //����Ʈ ������

    public Person(String pname) { //�̸��� �Ű������� �޴� ������
        name = pname;
    }
    //�̸�, Ű, �����Ը� �Ű������� �޴� ������
    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        //����Ʈ �����ڷ� Ŭ���� ���� �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
        Person personKim = new Person();
        personKim.name = "������";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        //�ν��Ͻ� ���� �ʱ�ȭ�� ���ÿ� Ŭ���� ����
        Person personLee = new Person("�̼���", 175, 75);
        System.out.println(personLee.name + "," + personLee.height + "," + personLee.weight);
    }
}
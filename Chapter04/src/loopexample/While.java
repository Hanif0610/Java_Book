package loopexample;

public class While {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num <= 10) { //num���� 10������ ���� �ݺ�
            sum += num; //sum�� num ���� ����
            num++; //num���� 1�� ������Ŵ
        }
        System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
    }
}
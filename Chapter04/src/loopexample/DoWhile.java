package loopexample;

public class DoWhile {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++; //sum += num�� num++�� ������ ���� �ƴϴ��� ������ �� �� ����
        } while(num <= 10);
        System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
    }
}
package loopexample;

public class NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;

        for(dan = 2; dan <= 9; dan++) { //2�ܺ��� 9�ܱ��� �ݺ�
            for(times = 1; times <= 9; times++) {//�� �ܿ��� 1~9�� ����
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println( ); //�� �� ����� ���
        }
    }
}
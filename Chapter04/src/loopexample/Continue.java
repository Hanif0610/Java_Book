package loopexample;

public class Continue {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 1; i <= 100; i++) {
            if(i%2 == 0) continue;
            total += i;
        }
        System.out.println("1���� 100������ Ȧ���� ���� : " + total + "�Դϴ�.");
    }
}
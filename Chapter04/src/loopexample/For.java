package loopexample;

public class For {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for(i = 1; i <= 10; i++) { //for������ Ƚ���� ǥ���� �� �ַ� i������ ����Ѵ�.
        	sum += i;
        }
        System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
    }
}
package operator;

public class Operation4 {
    public static void main(String[] args) {
        int num = 0B0000101;//5�� 8��Ʈ 2������ ǥ��

        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        System.out.println(num);//������ num�� ���

        num <<= 2;
        System.out.println(num);
    }
}
package operator;

public class Operation4 {
    public static void main(String[] args) {
        int num = 0B0000101;//5를 8비트 2진수로 표현

        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        System.out.println(num);//기존의 num값 출력

        num <<= 2;
        System.out.println(num);
    }
}
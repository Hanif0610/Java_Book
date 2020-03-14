package loopexample;

public class DoWhile {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++; //sum += num과 num++은 조건이 참이 아니더라도 무조건 한 번 수행
        } while(num <= 10);
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
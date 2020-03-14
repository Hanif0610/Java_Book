package loopexample;

public class For {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for(i = 1; i <= 10; i++) { //for문에서 횟수를 표현할 때 주로 i변수를 사용한다.
        	sum += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
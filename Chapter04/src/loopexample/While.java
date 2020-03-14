package loopexample;

public class While {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num <= 10) { //num값이 10이하인 동안 반복
            sum += num; //sum에 num 값을 더함
            num++; //num값을 1씩 증가시킴
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
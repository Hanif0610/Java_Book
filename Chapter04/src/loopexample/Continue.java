package loopexample;

public class Continue {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 1; i <= 100; i++) {
            if(i%2 == 0) continue;
            total += i;
        }
        System.out.println("1부터 100까지의 홀수의 합은 : " + total + "입니다.");
    }
}
package loopexample;

public class NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;

        for(dan = 2; dan <= 9; dan++) { //2단부터 9단까지 반복
            for(times = 1; times <= 9; times++) {//각 단에서 1~9를 곱함
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println( ); //한 줄 띄워서 출력
        }
    }
}
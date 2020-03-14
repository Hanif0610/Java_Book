package chapter2;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100; //선언과 동시의 초기화
        final int MIN_NUM;
        MIN_NUM = 0; //사용하기 전에 초기화. 초기화 하지 않으면 에러 발생
        
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
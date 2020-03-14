package interfaceex;

public interface Calc {
    double PI = 3.14;       //인터페이스에서 선언한 변수는
    int ERROR = -999999999; //컴파일 과정에서 상수로 변환됨

    int add(int num1, int num2);        //인터페이스에서
    int substract(int num1, int num2);  //선언한 메서드는
    int times(int num1, int num2);      //컴파일 과정에서
    int divide(int num1, int num2);     //추상 메서드로 변환
    
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    static int total(int[] arr) {
        int total = 0;

        for(int i : arr) {
            total += i;
        }
        return total;
    }
}
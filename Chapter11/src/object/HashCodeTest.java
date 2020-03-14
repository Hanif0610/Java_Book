package object;

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());    //abc 문자열의
        System.out.println(str2.hashCode());    //해시 코드 값 출력

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.hashCode());  //Integer(100)의
        System.out.println(i2.hashCode());  //해시 코드 값 출력
    }
}
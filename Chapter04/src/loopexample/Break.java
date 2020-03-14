package loopexample;

public class Break {
    public static void main(String[] args) {
        int i, sum = 0;
        for(i = 0; ; i++) {
            sum += i;
            if(sum >= 100) break;
        }
        System.out.println("i : " + i);
        System.out.println("sum : " + sum);
    }
}
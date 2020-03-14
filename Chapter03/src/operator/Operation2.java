package operator;

public class Operation2 {
    public static void main(String[] args) {
        int score = 150;

        int lastscore1 = ++score;
        System.out.println(lastscore1);

        int lastscore2 = score++;
        System.out.println(lastscore2);
    }
}
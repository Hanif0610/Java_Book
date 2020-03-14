package chapter2;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte b1 = 10;
        int i1 = b1;

        System.out.println(b1);
        System.out.println(i1);

        int i2 = 20;
        float f1 = i2;

        System.out.println(i2);
        System.out.println(f1);

        double d1;
        d1 = f1 + i2;
        System.out.println(d1);
    }
}
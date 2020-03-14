package abstractex;

public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("DeskTop display()");    //추상 메서드의 몸체 코드 작성
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()"); //추상 메서드의 몸체 코드 작성
    }
}
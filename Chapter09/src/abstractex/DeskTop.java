package abstractex;

public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("DeskTop display()");    //�߻� �޼����� ��ü �ڵ� �ۼ�
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()"); //�߻� �޼����� ��ü �ڵ� �ۼ�
    }
}
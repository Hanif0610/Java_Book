package scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {  //���ڸ� �Է� �޴� System.in.read()�� ����Ϸ��� IOException���� ������ ó���ؾ� �Ѵ�.
        System.out.println("��ȭ ��� �Ҵ� ����� �����Ͻÿ�.");
        System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
        System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
        System.out.println("P : �켱 ������ ���� �� ���� �Ҵ�");

        int ch = System.in.read();  //�Ҵ� ����� �Է¹޾� ch ������ ����
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if(ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if(ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("�������� �ʴ� ����Դϴ�.");
            return;
        }

        scheduler.getNextCall();        //� ��å�ΰ��� �������
        scheduler.sendCallToAgent();    //�������̽��� ������ �޼��� ȣ��
    }
}
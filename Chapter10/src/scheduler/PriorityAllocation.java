package scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����´�.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("���� ��ų�� ���� �������� �켱������ ���");
    }
}
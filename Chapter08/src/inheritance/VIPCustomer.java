package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
    	super();    //�����Ϸ��� �ڵ����� �߰��ϴ� �ڵ�. ���� Ŭ������ Customer()�� ȣ���
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() ������ ȣ��");
    }

    public int getAgentID() {
        return agentID;
    }
    
    public String showVIPInfo() {
        return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�."; 
    }
}
package innerclass;

class OutClass {						//�ܺ� Ŭ����
	private int num = 10;				//�ܺ� Ŭ���� private����
	private static int sNum = 20;		//�ܺ� Ŭ���� ���� ����
	
	static class InStaticClass {		//���� ���� Ŭ����
		int inNum = 100;				//���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200;		//���� ���� Ŭ������ ���� ����
		
		void inTest() {					//���� ���� Ŭ������ �Ϲ� �޼���
//			num += 10;					//�ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� �����Ƿ� �ּ�ó��
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() {			//���� ���� Ŭ������ ���� �޼���
//			num += 10;					//�ܺ� Ŭ������ �ν��Ͻ� ������ 
//			inNum += 10;				//����� �� �����Ƿ� �ּ�ó��
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}

}

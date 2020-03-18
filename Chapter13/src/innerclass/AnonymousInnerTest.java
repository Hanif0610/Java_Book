package innerclass;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {	//�͸� ���� Ŭ����. Runnable �������̽� ����
			@Override
			public void run() {
//				num = 200;
//				i = 10;
				System.out.println(i);
				System.out.println(num);
			}
		};	//Ŭ���� ���� ;��
	}
	
	Runnable runner = new Runnable() {	//�͸� ���� Ŭ������ ������ ����
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}

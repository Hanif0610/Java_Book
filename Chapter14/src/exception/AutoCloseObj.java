package exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {	//close �޼��� ����
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}
}

package exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {	//close 메서드 구현
		System.out.println("리소스가 close() 되었습니다.");
	}
}

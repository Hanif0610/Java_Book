package exception;

public class IDFormatException extends Exception {
	public IDFormatException(String message) {	//생성자의 매개변수로 예외 상황 메시지를 받음
		super(message);
	}
}

package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}
}

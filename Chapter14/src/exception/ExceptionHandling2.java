package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();	//���� �Է� ��Ʈ�� �ݱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}
}

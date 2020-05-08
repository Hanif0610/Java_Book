package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65);	//FileOutPutStream��
			fos.write(66);	//���Ͽ� ���ڸ� ����
			fos.write(67);	//�ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ��
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}

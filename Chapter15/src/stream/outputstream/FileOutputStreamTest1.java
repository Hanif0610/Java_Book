package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65);	//FileOutPutStream은
			fos.write(66);	//파일에 숫자를 쓰면
			fos.write(67);	//해당하는 아스키 코드 값으로 변환됨
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}

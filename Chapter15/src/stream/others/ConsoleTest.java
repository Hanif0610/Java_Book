package stream.others;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();	//�ܼ� Ŭ���� ��ȯ
		
		System.out.print("�̸� : ");
		String name = console.readLine();
		System.out.print("���� : ");
		String job = console.readLine();
		System.out.print("��й�ȣ : ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}

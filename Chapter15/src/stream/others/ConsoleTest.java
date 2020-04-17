package stream.others;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();	//콘솔 클래스 반환
		
		System.out.print("이름 : ");
		String name = console.readLine();
		System.out.print("직업 : ");
		String job = console.readLine();
		System.out.print("비밀번호 : ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}

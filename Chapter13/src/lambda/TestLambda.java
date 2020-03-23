package lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();		//변수로 반환하기
		reStr.showString("hello ");				//메서드 호출
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
}
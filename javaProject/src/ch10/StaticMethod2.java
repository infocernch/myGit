package ch10;

public class StaticMethod2 {
	// 멤버변수

	static int num = 10; // 사번

	static String name = "홍길동";

	String email = "hong@gmail.com";

	String hp = "010-1234-5678";

	String addr = "서울 강남구 역삼동";
	
	public void printA() {
		System.out.println("사번 : "+ num + "\n"+"이름 : "+name+ "\n"+
	"이메일 : "+ email+ "\n"+"전화 : "+hp+ "\n"+"주소 : "+addr);
	}
	
	public static void printB() {
		StaticMethod2 a = new StaticMethod2();
		System.out.println("사번 : "+ num + "\n"+"이름 : "+name+ "\n"+
				"이메일 : "+ a.email+ "\n"+"전화 : "+a.hp+ "\n"+"주소 : "+a.addr);
				}
	
	public static void main(String[] args) {
		printB();
		StaticMethod2 a = new StaticMethod2();
		System.out.println();
		a.printA();
	}
}
	


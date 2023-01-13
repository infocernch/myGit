package ch06;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {//첫번째 심부름
		secondMethod();
		
	}

	static void secondMethod() {//첫번째 심부름에서 시킨 심부름
		System.out.println("secondMethod()");
		
	}
}

package ch02;

public class Interpret {
	public static void main(String[] args) {
		int a;
		int b;
		int tot;
		
		a=1;
		b=2;
		tot= a+b;//변수에 값이 초기화 안된 상태에서 연산하면 에러가 난다.
		//(순차적 인터프린트 방식이기 때문)
		System.out.println(tot);
	}
}

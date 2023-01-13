package ch03;

public class SignIncrementDemo {
	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은 " + plusOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");
		
		int x=1, y=1;
		System.out.println("x = " + x + ", ++x = " + ++x);
		System.out.println("y = " + y + ", ++y = " + y++);//후위 연산자는 해당줄에서는 연산이 안됨
		System.out.println("x = " + x + ", y = " + y);//다음줄에 연산반영됨
	}
}

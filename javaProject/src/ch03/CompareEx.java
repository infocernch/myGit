package ch03;

public class CompareEx {
	public static void main(String[] args) {
		int a =65;
		char c = 'A'; //아스키값이 65
		char d = 'D';
		System.out.println( a == c); // 비교연산자 좌변우변이 같나?
		System.out.println(a = c); //대입 연산자 c가 a로
		System.out.println(c != 65);// != not Equal
		System.out.println(d);
	}
}

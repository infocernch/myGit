package ch02;



/**
 * @author 우병걸
 * @version 1.0 2022-12-13
 */
public class HelloExam {
	
	public static int sum(int n, int m) {//메소드 n=20, m=10
		return n + m;
	}
	//프로그램의 시작은 메인메소드
	public static void main(String[] args) {//메인메소드
		int i = 20; //변수 초기화(할당 도는 저장)
		int s;//지역변수 선언만
		char a;//지역변수 선언만
		
		s = sum(i, 10);//s=30;
		a = '?';//지역변수 초기화
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}//프로그램 종료
}

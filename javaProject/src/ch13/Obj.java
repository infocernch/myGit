package ch13;

public class Obj {//extends Object 생략되어있음
	public static void main(String[] args) {
		Obj e1= new Obj();
		System.out.println(e1.getClass());//클래스 정보
		System.out.println(e1);//주소값
		System.out.println(e1.toString());//문자열처리
	}
}

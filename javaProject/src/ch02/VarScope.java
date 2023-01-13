package ch02;

public class VarScope {//클래스
	static int x; // 전역변수 (멤버,필드)는 선언만 해도된다 .왜? 자동초기화되기 때문
	
	
public static void main(String[] args) {//메소드
	//main(ma) + Ctrl == main 메소드 자동완성
	int y = 0; // 지역변수
	
	System.out.println("x = "+ x);
	System.out.println("y = " +  y);
	}
}

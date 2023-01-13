package ch02;

public class VarInitTest {
	public static void main(String[] arg) {
		int index=5;// 지역변수 선언만
		//지역변수는 반드시 초기화를 해야한다,
		
		index = index + 1; //?+1
		System.out.println("index : " + index);
	}
}

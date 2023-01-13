package ch12;

public class StaticOuter {
	static int x = 10;
	static class Inner{
		int getX() {
			return x;
		}
	}
	
	public static void main(String[] args) {
		StaticOuter.Inner in = new StaticOuter.Inner();
//		static일때 
//		외부클래스.내부클래스 참조변수 = new 외부클래스.내부생성자;
		System.out.println(in.getX());
	}
}

package ch12;

public class TestOuter {
	
	private int data=30;
	
	class Inner{//내부클래스
		void msg() {
			System.out.println("data is "+data);
			//외부클래스의 private멤버변수도 쓸수 있다..
		}
	}
	
	public static void main(String[] args) {
		TestOuter obj = new TestOuter();
		TestOuter.Inner in = obj.new Inner();
//		외부클래스.내부클래스 참조변수 = 외부참조변수.new 내부생성자();
		in.msg();
	}

}

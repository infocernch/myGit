package ch12;

public class MemberOuter {
	
	class TestInner{
		public int num = 1;
		private String name = "홍길동";
		private String email = "hong@gmail.com";
		public void print() {
			System.out.println("고객번호 : "+ num+"\n"+"이름 :"+name+"\n"
							+"이메일 : "+email);
		}
		
	}

	
	
	public static void main(String[] args) {
		MemberOuter mem = new MemberOuter();//외부객체생성
		MemberOuter.TestInner a = mem.new TestInner();
		a.print();
		
	}
}

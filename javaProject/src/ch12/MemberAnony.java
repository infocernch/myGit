package ch12;

public class MemberAnony {

	public static void main(String[] args) {
		
		
		int a = 2;
		String name = "김길동";
		String email = "kim@gmail.com";
		
		
		Member m = new Member() {
			
			@Override
			public void print() {
				num();
				name();
				email();
				
			}
			
			@Override
			public void num() {
				System.out.println("고객번호 : "+ a);
				
			}
			
			@Override
			public void name() {
				System.out.println("이름 : "+ name);
				
			}
			
			@Override
			public void email() {
				System.out.println("이메일 : "+ email);
				
			}
		};
	m.print();
	}
}

package ch07;

public class PersonUse2 {
	public static void main(String[] args) {
		//객체생성
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.seteMail("hong@naver.com");
		p1.setAdd("서울 강남구 역삼동");
		
		Person p2 = new Person();
		p2.setName("사임당");
		p2.setAge(25);
		p2.seteMail("saimdang@gmail.com");
		p2.setAdd("서울 강남구 개포동");
		
		p1.print1();
		System.out.println();
		p2.print1();
	}
}

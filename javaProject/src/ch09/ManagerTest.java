package ch09;

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.input(1, "123456-1234567", "홍길동", "서울 강남구 역삼동", 
				"hong@gmial.com", 3000);
		m.cal();
		m.print();
	}
}

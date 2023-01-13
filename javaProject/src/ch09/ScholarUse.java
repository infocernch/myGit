package ch09;

public class ScholarUse {
	public static void main(String[] args) {
		Scholar s1 = new Scholar();
		//1. 부모클래스인 Student 객체가 생성
		//2. Student 생성자호출
		//3. 자식클래스 Scholar 객체 생성
		//4. Scholar 생성자호출
		s1.input("김철수", "2201", "컴공", 1, "1종", 2500000);
		s1.print();
		
		s1.input("홍길동", "2103", "전자", 3);//자식한테 가서 없으면 부모클래스로감.
		s1.print2();
	}
}

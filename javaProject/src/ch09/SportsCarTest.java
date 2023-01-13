package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj = new SportsCar();//객체 생성
		//SportsCar 객체는 Car 객체를 상속받았기 때문에
		//부모클래스도 SportsCar객채를 생성시 자동 생성된다
		//부모객체의 멤버들(변수, 메소드..)을 모두 사용가능.
		obj.speed = 10;//Car 객체의 멤버변수 초기화
		obj.setSpeed(60);//Car 객체의 멤버메소드 호출
		obj.setTurbo(true);
		
		
	}
}

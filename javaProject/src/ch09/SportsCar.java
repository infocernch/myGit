package ch09;

public class SportsCar extends Car{//Car클래스와 상속관계를 만듦
	boolean turbo;
	
	public void setTurbo(boolean flag) {//터보모드설정 메소드
		turbo = flag;
		System.out.println(turbo);
		
	}

}

package ch11;

public class FlyUse {
	public static void main(String[] args) {
//		Bird bird = new Bird();
//		bird.takeOff();
//		bird.fly();
//		bird.land();
//		Airplane air = new Airplane();
//		air.takeOff();
//		air.fly();
//		air.land();
		
		//다형성기법 좌:부모, 우:자식
		Flyer f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		f= new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}
}

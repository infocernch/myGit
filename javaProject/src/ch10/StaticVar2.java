package ch10;

public class StaticVar2 {
	static int total;//0
	String model;//소나타,모닝,아반떼
	public StaticVar2(String model) {//생성자
		this.model = model;
		total++;
	}
}

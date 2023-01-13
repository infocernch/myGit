package ch03;

public class Condition {
	public static void main(String[] args) {
		int num = -5;
		System.out.println( num>0 ? num : -num );// --5 Q/T/F
		if(num>0) {//조건이 t면
			System.out.println(num);
		}else {//조건이 f면
			System.out.println(-num);
		}
	}
}

package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio britz = new Radio();
		britz.chan = 89.1;
		britz.name = "브리츠";
		britz.vol = 12;
		britz.onOff = true;
		
		britz.print();
		System.out.println();
		
		Radio iriver = new Radio();
		iriver.chan = 95.1;
		iriver.name = "아이리버";
		iriver.vol = 9;
		iriver.onOff = false;
		
		iriver.print();
	}
}

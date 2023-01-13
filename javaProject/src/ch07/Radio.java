package ch07;

public class Radio {
	String name;
	boolean onOff;
	double chan;
	int vol;
	
	void print() {
		
		System.out.println("["+name+"라디오"+"]");
		if(onOff==true) {
			System.out.println("라디오가 켜져있습니다.");
		}else {
			System.out.println("라디오가 꺼져있습니다");
		}
		System.out.println("현재 채널은 "+chan+" 입니다.");
		System.out.println("볼륨은 "+vol+"입니다.");
	}
	
	

}

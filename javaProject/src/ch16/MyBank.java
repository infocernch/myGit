package ch16;

public class MyBank {
	//공유객체
	
	
	
	
	public synchronized void balanceH(String name) {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println(name+"님의 통장잔고는"+i*10+"만원입니다.");
			
		}
	}
		
	
	public synchronized void balanceS(String name) {
		for(int i=2;i<=6;i++) {
			System.out.println(name+"님의 통장잔고는"+i*10+"만원입니다.");
		}
	}
	
	public synchronized void balanceY(String name) {
		for(int i=3;i<=7;i++) {
			
			System.out.println(name+"님의 통장잔고는"+i*10+"만원입니다.");
		}
	}
}

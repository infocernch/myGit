package ch16;

public class BankPlyer extends Thread {

	int type;
	MyBank myBank;
	
	public BankPlyer(int type, MyBank myBank ) {
		this.type = type;
		this.myBank = myBank;
	}
	
	
	@Override
	public void run() {
		switch (type) {
		case 1: myBank.balanceH("홍길동");break;
		case 2: myBank.balanceS("사임당");break;
		case 3: myBank.balanceY("이몽룡");break;

		
		}
		
	}
	
	
	
	
}

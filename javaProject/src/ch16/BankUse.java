package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank m = new MyBank();
		BankPlyer h = new BankPlyer(1, m);
		BankPlyer s = new BankPlyer(2, m);
		BankPlyer y = new BankPlyer(3, m);
		
		h.start();
		s.start();
		y.start();
		
	}
}

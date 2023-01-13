package ch09;

public class SaleUse {
	public static void main(String[] args) {
		Sale p1 = new Sale();
		p1.input(1, "냉장고", "LG", "202203", 2000, 5, 0);
		p1.calc();
		p1.print();
	}
}

package ch08;

public class Bookuse {
	public static void main(String[] args) {
		Book b = new Book("Java", "홍길동", "영진", 2017, 45000, 5);
		b.print();

		System.out.println();

		Book b1 = new Book();
		b1.print();
	}
}

package ch04;

public class Char_Toewr {
	public static void main(String[] args) {
		int i,j;
		char a=65; //65= 아스키값으로 A
		for(i=1;i<5; i++) {
			for(j=1;j<=i;j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}

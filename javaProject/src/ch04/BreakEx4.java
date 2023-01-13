package ch04;

public class BreakEx4 {
	public static void main(String[] args) {
		int i = 1;
		while (i<9) {//1~9까지 반복
			if(i==8) break; //i가 8이면 멈춤
			System.out.println(i + "Hello World");
			i++;
		}
		System.out.println("n값이 8이면 while문 빠져나옴");
		
	}

}

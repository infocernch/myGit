package ch02;

import java.util.Scanner;

public class Add_Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x; //지역변수
		int y;
		int sum;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();//정수형으로 값을 받는다.
		System.out.println("두번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
		
		input.close();// Scanner 객체닫기		
	}
}

package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));//올림
		System.out.println(Math.round(10.5));//반올림
		System.out.println(Math.floor(10.9));//내림
		System.out.println(Math.pow(10,3));//10의 3승
		Random rand = new Random();
		System.out.println("정수값 : "+ rand.nextInt(100));//100이하의 정수랜덤
		System.out.println("실수값 : "+ rand.nextDouble());// 실수랜덤
		
		int a = 10;
		Integer b = 20;//1.5이하버전에서는 에러,intValue()가 작동
		Integer c = new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());//정식문법,intValue는 생략가능
	}
}

package ch03;

import java.util.Scanner;

//국영수 점수를 입력받아 총점, 평균출력
public class Point {
	public static void main(String[] args) {
		//변수선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		//정수타입 int => 4byte 
		//실수타입 double => 8byte 
		
		
		//입력객체생성
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		name = scan.next();//문자열 입력
		System.out.println("국어 : ");
		kor = scan.nextInt();
		System.out.println("영어 : ");
		eng = scan.nextInt();
		System.out.println("수학 : ");  
		mat = scan.nextInt();
		scan.close();
		
		//계산
		tot = kor+eng+mat;
		avg = tot/3.0; //avg가 실수형이기 때문에 숫자도 실수형으로
		
		//결과출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");//tab만큼 떨어트림
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f", name, kor, eng, mat, tot, avg);
		System.out.println();
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f", name, kor, eng, mat, tot, avg));
		
		
		
	}
}

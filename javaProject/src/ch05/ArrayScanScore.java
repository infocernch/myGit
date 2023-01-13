package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int total=0;
		int stu;
		double avg = 0;
		
		System.out.print("학생수를 입력하세요 : ");
		stu = sc.nextInt();
		int[] score = new int[stu];
		for(int i=0;i<score.length;i++) {
			System.out.println("성적을 입력하세요 : ");
			score[i] = sc.nextInt();
		}
		for(int i=0;i<score.length;i++) {
			total += score[i];
		}
		avg = total/score.length;
		
		System.out.printf("총점은 %d 입니다.",total);
		System.out.printf("평균 성적은 %.1f 입니다.",avg);
		sc.close();
	}
		

}

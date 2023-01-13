package ch05;

import java.util.Scanner;

public class ArrayScore2d_Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("학생수를 입력하세요 : ");
		int noSubject = 3;
		int[][] score = new int[scan.nextInt()][noSubject];
		System.out.println( "국, 영, 수 점수를 각각 입력하세요 :" );
		
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + "번 학생의 점수 : ");
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = scan.nextInt();
			
			}
		}
		
		scan.close();
		System.out.println();
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + "\t");
			int tot = 0;
			double avg = 0.0;
			char grade = ' ';
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				tot += score[i][j];
			}
			
			
			avg = (double) tot/noSubject;
			
			if (avg>90) grade = 'A';
			else if (avg>80) grade = 'B';
			else if (avg>70) grade = 'C';
			else grade = 'F';
			
			System.out.printf("%d\t%.1f\t%s\n", tot, avg, grade);
				
		}
		
	}

}

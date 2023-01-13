package ch06;

import java.util.Scanner;

public class ScanPoint {
	static int hak[] ; //학생수
	static int kor[] ; //국어
	static int eng[] ; // 영어
	static int mat[] ;//수학
	static int tot[] ;
	static double avg[];
	
	
	public static void main(String[] args) {
		scan();
		toT();
		avG();
		print();
	}

	static void print() {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<hak.length;i++) {
			System.out.println((i+1)+"\t"+kor[i]+"\t"+eng[i]+"\t"
					+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i] ));
		}
		
	}

	static void avG() {
		avg= new double[hak.length];
		for(int i =0;i<hak.length;i++) {
			avg[i] = tot[i]/3.0;
		}
		
	}

	static void toT() {
		tot = new int[hak.length];
		for(int i=0;i<hak.length;i++)
			tot[i] = kor[i] + eng[i] + mat[i];
		}

	static void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		hak = new int [sc.nextInt()];
		kor = new int[hak.length];
		eng = new int[hak.length];
		mat = new int[hak.length];
		
		for(int i=0;i<hak.length;i++) {
			System.out.println((i+1)+"번째 학생점수를 입력하세요");
			System.out.println();
			System.out.print("국어점수를 입력하세요 : ");
			kor[i] = sc.nextInt();
			
			
			System.out.print("영어점수를 입력하세요 : ");
			eng[i] = sc.nextInt();
			
			
			System.out.print("수학점수를 입력하세요 : ");
			mat[i] = sc.nextInt();
		}
		sc.close();
	}//scan
}//class
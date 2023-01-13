package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = {"",""};
		int [] kor = {0,0};
		int [] eng = {0,0};
		int [] mat = {0,0};
		int [] tot = {0,0};
		double [] avg = new double[2];
		double tot_avg=0;
		
		
		
		for(int i =0;i<name.length;i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수를 입력하세요 : ");
			kor[i] = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			mat[i] = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng[i] = sc.nextInt();
			
		
				tot[i] = kor[i] + mat[i] + eng[i];
				avg[i] = tot[i] / 3.0;
				tot_avg += avg[i]; 
			
		}//for
		System.out.println();
		sc.close();
		for(int i=0;i<2;i++) 
			System.out.println("이름 : " + name[i] +  "\n" + "국어 : " + kor[i] +  "\n"
					+ "수학 : "+mat[i]+  "\n"+"영어 : "+ eng[i]+  "\n"+
					"총점 : " + tot[i]+  "\n"+"평균 : "+String.format("%.1f", avg[i])+  "\n");
		
		System.out.println("학급평균 : "+ String.format("%.1f" ,tot_avg/2.0));
		
		
		
	
	}

}

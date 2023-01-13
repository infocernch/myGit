package ch04;

import java.util.Scanner;

public class While_Hakjum {
		public static void main(String[] args) {
			int kor = 0;
			int eng = 0;
			int mat = 0;
			String result = "";
			
			Scanner sc =new Scanner(System.in);
			System.out.println("전체 성적입력이 끝나면 마지막에 -1 을 입력하세요.");
			System.out.print("아무 정수나 입력하세요 : ");
			int num = sc.nextInt();
			
			while(num != -1) {//-1이 입력되면 빠져나감
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				mat = sc.nextInt();
				
				System.out.print("계속하려면 아무 정수나 입력하세요 : ");
				num = sc.nextInt();
			
			
			int tot=kor+eng+mat;
			double avg= tot/3.0;
			String grade="";
			
			if(avg>=90) {
				grade = "수";
			}else if(avg>=80) {
				grade = "우";
			}else if(avg>=70) {
				grade = "미";
			}else if(avg>=60) {
				grade = "양";
			}else {
				grade = "가";
				}
			
			//계산
			result+= kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
			
			}//while
			sc.close();
			//출력
			System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
			
			System.out.printf(result);
		}//main

}

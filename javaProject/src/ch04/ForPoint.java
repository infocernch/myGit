package ch04;
//result사용시 소수점 한자리로 바꾸는법을 모르겠어요 ,,
import java.util.Scanner;

public class ForPoint {
	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		String result = "";
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			
			System.out.print("국어 : ");
			kor=sc.nextInt();
			System.out.print("영어 : ");
			eng=sc.nextInt();
			System.out.print("수학 : ");
			mat=sc.nextInt();
			
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
			
			
			result+= kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
			
		}//for
		sc.close();
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(result);
	
	}//main

}

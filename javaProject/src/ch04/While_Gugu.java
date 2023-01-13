package ch04;

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
	
		int j = 1;
		int dan = 0;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("구구단에서 출력하고싶은 단을 입력하세요 : ");
		dan = sc.nextInt();
		
		while(dan<=9) {
			System.out.println("**"+dan+"단"+"**");
			
			while(j<=9) {
				System.out.println(dan + " x " + j +" = "+(dan*j));
				j++;
			}//inner while
			j=1;
			break;
			
		}//outer while
		sc.close();
	}//main

}

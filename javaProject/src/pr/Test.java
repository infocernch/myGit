package pr;

import java.util.Scanner;

public class Test {
	public static void sum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num =sc.nextInt();
		
		int sum = 0;
		if(num>=0) {//num이 0 보다 크면
			int i = 1;
			while (i<=num) {//i가 입력된 수보다 작다면
				sum += i ;
				i++;
			}
			System.out.println("1부터"+num+"까지의 합은"+ sum+"입니다");
		}else 
			System.out.println("숫자가 1이상이 아닙니다.");
	}
	
	public static void main(String[] args) {
		sum();
	}
}

package ch04;

public class For_If_Else {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += i; //sum = sum+i
			System.out.print(i);//더하는수 출력
			if(i<=9) {//1~9 '+' 출력
				System.out.print("+");
			}else {// i가 10인 경우 
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}

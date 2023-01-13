package ch04;
//continue (계속문)
public class CountinueEx1 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%5 ==0) continue;//이하코드 무시, 다음단계로
			System.out.println(i);
		}
	}

}

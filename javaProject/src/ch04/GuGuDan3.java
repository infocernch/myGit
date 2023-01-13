package ch04;

public class GuGuDan3 {
	public static void main(String[] args) {
		for(int dan=2; dan<=9;dan++) {//2,3,4,...9
			
			for(int n=1; n<=9; n++) {//1,2,4...9
				
				System.out.print(dan +" * " + n + " = " + dan*n+"\t");
				
			}//inner
			System.out.println();
		} //outer
	}//메소드
}

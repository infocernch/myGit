package ch10;

public class Ch3 extends Pa3 {
	
	
	@Override
	public void print() {
		Ch3 c = new Ch3();
		System.out.println("사번 : "+ num + "\n"+"이름 : "+name+ "\n"+
		  "이메일 : "+ c.email+ "\n"+"전화 : "+c.hp+ "\n"+"주소 : "+c.addr);
	}
}

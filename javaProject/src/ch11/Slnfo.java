package ch11;

public class Slnfo implements Student {
	public String name = "홍길동";
	public String ad = "서울 강남구";
	public String email = "hong@gmail.com";
	
	public int kor = 90;
	public int eng = 85;
	public int mat = 79;
	public int total = kor+eng+mat;
	public double avg = total/3.0;
	
	@Override
	public void address() {
		System.out.println("이름\t주소\t이메일");
		System.out.println(name+"\t"+ad+"\t"+email);
		
	}

	@Override
	public void point() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"
					+total+"\t"+String.format("%.1f", avg));
		
	}
	
	

}

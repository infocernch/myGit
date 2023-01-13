package ch07;

public class PointUse {
	public static void main(String[] args) {
		Point p = new Point();
		//데이터 입력
		p.setName("김철수");
		p.setKor(90);
		p.setEng(80);
		p.setMat(89);
		//출력
		p.print();
	}
}

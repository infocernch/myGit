package ch06;

public class StudentPoint {
	static String[] name = {"홍길동","사임당","이순신"};//이름
	static int[] num = {1001,1002,1003};//학번
	static int [] java = {90,95,84};
	static int [] db = {85,79,92};
	static int [] html = {99,88,95};
	static int [] jsp = {76,92,72};
	static int [] tot = {0,0,0};
	static double [] avg = {0.0,0.0,0.0};
	
	public static void main(String[] args) {
		
		calc();//총점
		getAvg();//평균
		print();//출력
	}


	static void calc() {//총점계산
		for(int i=0;i<num.length;i++) {
			tot[i] = java[i] + db[i] + html[i] + jsp[i];
			}
	}//calc
	
	static void getAvg() {//평균계산
			for(int i=0; i<num.length;i++) {
				avg[i] = tot[i]/4.0;
			}
			
		}//getAvg
	
	private static void print() {
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+"\t"+name[i]+"\t"+java[i]+"\t"
					+db[i]+"\t"+html[i]+"\t"+jsp[i]+"\t"+tot[i]+"\t"+
					String.format("%.1f", avg[i]));
		}
		
	}
	}//class


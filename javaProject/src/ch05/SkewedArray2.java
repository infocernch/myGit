package ch05;
//비정방형배열(가변형,레그드배열)
public class SkewedArray2 {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3]; //첫째행에 3개의 열 생성
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];//넷째행에 2개의 열 생성
		
		for(int i=0;i<intArray.length;i++) {//형
			for(int j=0;j<intArray[i].length;j++) {//열
				intArray[i][j] = (i+1)*10 +j; //데이터입력
			}
				
		}
		for(int i=0;i<intArray.length;i++) {//행
			for(int j=0;j<intArray[i].length;j++) {//열
				System.out.print(intArray[i][j]+" ");//데이터 출력
			}
				System.out.println();
		}//outer for
	}

}

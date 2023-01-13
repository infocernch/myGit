package ch05;

public class GetMinMax {
	public static void main(String[] args) {
		int[] a= {79,88,91,33,100,55,95};
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) 
				min = a[i];
			}//for
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}

}

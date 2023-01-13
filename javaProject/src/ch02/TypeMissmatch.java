package ch02;

public class TypeMissmatch {
	public static void main(String[] args) {
		byte n;
		n = 127;// byte의 값은 -128~127까지 정수저장가능
		System.out.println(n);
	}
}

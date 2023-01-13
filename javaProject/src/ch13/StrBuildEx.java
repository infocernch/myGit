package ch13;

public class StrBuildEx {
	static StringBuilder str1 = new StringBuilder("I am a");
	static StringBuilder str2 = new StringBuilder(" Java Programmer");
	
	static void app() {
		
		str1.append(str2);
		System.out.println(str1);
	}
	static void rep() {
		
		System.out.println(str1.replace(7, 11, "Jsp"));
		
	}
	static void sub() {
		
		System.out.println(str1.substring(7));
		
	}
	public static void main(String[] args) {
		app();
		rep();
		sub();
		
		
		
	}
}

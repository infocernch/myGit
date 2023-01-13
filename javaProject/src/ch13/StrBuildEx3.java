package ch13;

public class StrBuildEx3 {
	static String str1 = "I am a";
	static String str2 =" Java Programmer";
	static StringBuilder str = new StringBuilder(str1);
	static void app() {
		
		str.append(str2);
		System.out.println(str);
	}
	static void rep() {
		str1 +=str2;
		System.out.println(str1.replace("Java", "Jsp"));
		
	}
	static void sub() {
		
		str.replace(7, 11, "Jsp");
		System.out.println(str.substring(7));
		
	}
	public static void main(String[] args) {
		app();
		rep();
		sub();
		
		
		
	}
}

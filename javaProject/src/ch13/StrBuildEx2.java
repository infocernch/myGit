package ch13;

public class StrBuildEx2 {
	public static void main(String[] args) {
		String str1 = "I am a";
		String str2 = " Java Programmer";
		StringBuilder str = new StringBuilder(str1);
		
	//append
		str.append(str2);
		System.out.println(str);
		
	//replace
		str1 += str2;
		str1.replace("Java", "JSP");
		System.out.println(str1.replace("Java", "JSP"));
		
		//substring
		str.replace(7, 11, "Jsp");
		System.out.println(str.substring(7));
		
		
		
		
		
		
		
	}
}

package ch13;

public class WrapperEx3 {
	
	static String str = new String ("Hello 1234");
	
	static void cha() {
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i)+"는 대문자입니다.");
			}else if(Character.isLowerCase(str.charAt(i))) {
				System.out.println(str.charAt(i)+"는 소문자입니다.");
			}else if (Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i)+"는 숫자입니다.");
			}
			else {
				System.out.println(str.charAt(i)+"는 기타입니다.");
			}
		}
	}
	static void integer() {
		
		str= str.substring(6);
		System.out.println("문자 "+str +"입니다");
		
		System.out.println("숫자 "+(Integer.parseInt(str))+"입니다");
		
		System.out.println("숫자 "+Integer.parseInt(str)+"+2 = "+
				(Integer.parseInt(str)+2)+"입니다");
		
		
		
	}
	
	
	public static void main(String[] args) {
		cha();
		System.out.println("----------------------------"); 
		integer();
	}
}

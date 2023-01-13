package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream: 1byte단위로 읽음
//InputStreamReader : 문자단위(2byte)로 읽음 (한글가능)
public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
//		new InputStreamReader(InputStream) 처리해야함.
		InputStreamReader isr = new InputStreamReader(is);//2byte
		System.out.println("한글자를 입력하세요 :");
		
		try {
			int code = isr.read();//글자의 코드값
			System.out.println("code : "+code);
			char ch = (char)code;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

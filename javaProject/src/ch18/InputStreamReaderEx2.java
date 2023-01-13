package ch18;

import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {
	public static void main(String[] args) {
		int var = 0;
		
		//new InputStreamReader(InputStream);
		Reader input = new InputStreamReader(System.in);//System.in은 대표적인 인풋스트림
		
		System.out.print("입력하세요 : ");
		try {
			while (true) {
				var = input.read();//1문자로 읽어드림
				if(var == 13) break;//엔터키(13)가 들어오면 종료
				System.out.println(var+"==>"+(char)var);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

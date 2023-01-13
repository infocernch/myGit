package ch18;

import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		
		String str = null;
		
		try {
			RandomAccessFile file = new RandomAccessFile
					("C:\\test\\rand2.txt", "rw");
			file.seek(9);
			file.write("park".getBytes());
			
			while (file.getFilePointer()<file.length()) {
				str = file.readLine();
				
				
				file.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
		
	}
}

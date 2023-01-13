package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress	adress = InetAddress.getByName("google.com");
			System.out.println(adress);//호스트이름,ip주소값 리턴
			System.out.println(adress.getHostName());//호스트이름(도메인이름)
			System.out.println(adress.getHostAddress());//ip주소값
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}

package networkex;

import java.net.*;
import java.util.*;

public class NetworkEx1 {
	public static void main(String[] args) {
		
		//IP주소 다루는 클래스
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com"); //도메인명(host)을 통해 IP주소 얻기
			System.out.println("getHostName() :" + ip.getHostName()); //호스트의 이름을 반환
			System.out.println("getHostAddress() :" + ip.getHostAddress()); //호스트의 IP주소를 반환
			System.out.println("toString() :" + ip.toString());
			
			byte[] ipAddr = ip.getAddress();  //IP주소를 byte배열로 반환
			System.out.println("getAddress() :" + Arrays.toString(ipAddr));
			
			String result = "";
			for(int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
				result += ".";
			}
			System.out.println("getAddress()+256 :" + result);
			System.out.println();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() :" + ip.getHostName()); //로컬호스트의 이름을 반환
			System.out.println("getHostAddress() :" + ip.getHostAddress()); //로컬호스트의 IP주소를 반환
			System.out.println();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			ipArr = InetAddress.getAllByName("www.naver.com"); //도메인명(host)에 지정된 모든 호스트의 IP주소를 배열에 담아 반환
			
			for(int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"] :" + ipArr[i]);
			}
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	} //main
}

package networkex;

import java.net.*;

public class NetworkEx2 {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://developer.spotify.com/documentation/web-api/quick-start/");
		
		System.out.println("url.getAuthority() :" + url.getAuthority()); //호스트명과 포트를 문자열로 반환
		System.out.println("url.getContent() :" + url.getContent()); //URL의 Content객체를 반환
		System.out.println("url.getDefaultPort() :" + url.getDefaultPort()); //URL의 기본 포트를 반환(http는 80)
		System.out.println("url.getPort() :" + url.getPort()); //포트를 반환
		System.out.println("url.getFile() :" + url.getFile()); //파일명 반환
		System.out.println("url.getHost() :" + url.getHost()); //호스트명 반환
		System.out.println("url.getPath() :" + url.getPath()); //경로명 반환
		System.out.println("url.getProtocol() :" + url.getProtocol()); //프로토콜 반환

	}
}

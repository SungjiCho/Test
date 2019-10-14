package networkex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class NetworkEx3 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://cran.r-project.org/web/packages/EFAutilities/EFAutilities.pdf";
		BufferedReader input = null;
		String line = "";
		
		try {
			url = new URL(address);
			
			/*Http URLConnection 반환(URL프로토콜이 http프로토콜이라면)
			 *URLConnection을 사용해서 연결하고자 하는 자원에 접근하고 읽고 쓰기를 할 수 있음*/
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString():" + conn);
			System.out.println("getAllowUserInteraction():"
					+ conn.getAllowUserInteraction()); //UserInteraction의 허용여부 반환
			System.out.println("getConnectTimeout():"
					+ conn.getConnectTimeout()); //연결종료시간을 천분의 일초로 반환
			System.out.println("getContent():"
					+ conn.getContent()); //content객체를 반환
			System.out.println("getContentEncoding():"
					+ conn.getContentEncoding()); //content의 인코딩을 반환
			System.out.println("getContentType():"
					+ conn.getContentType()); //content의 type을 반환
			
			
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			while((line=input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

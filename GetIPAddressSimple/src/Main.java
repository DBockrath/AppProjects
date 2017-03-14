import java.net.*;
import java.io.*;

class Main {
	
	public static void main(String[] args) throws Exception {
		
		try {
			
		InetAddress localhost = InetAddress.getLocalHost();
		URL whatIsMyIp = new URL("http://checkip.amazonaws.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(whatIsMyIp.openStream()));
		
		String ip = in.readLine();
		String privateIp = localhost.getHostAddress();
		String hostname = localhost.getHostName();
		
		System.out.println(ip);
		System.out.println(privateIp);
		System.out.println(hostname);
		
		} catch (UnknownHostException ex) {
			
			ex.printStackTrace();
			
		}
		
	}
	
}

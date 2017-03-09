import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

class Main {
	
	public static void main(String[] args) throws UnknownHostException {
		
		try {
			
		InetAddress localhost = InetAddress.getLocalHost();
		String ip = localhost.getHostAddress();
		String hostname = localhost.getHostName();
		List addresses = InetAddress.getAllByName(localhost.getCanonicalHostName());
		
		System.out.println(ip);
		System.out.println(hostname);
		
		} catch (UnknownHostException ex) {
			
			ex.printStackTrace();
			
		}
		
	}
	
}

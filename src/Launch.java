import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("   =console_interface=");
		new Factory().doSomething();
		
		new ReportMessage();

	}

}


class Factory {
	/* class Factory this is virtual user */
	int a, b, c;
	
	void doSomething() throws InterruptedException {
		for(int i = 0; i < 10; i++) {
			work();	//..here many industrial processes
			sendReport();	//..sending report to IP address
			Thread.sleep(2000);
			System.out.println("..cycle number: " + i);
			System.out.println();
		}
		
		int[] data = new int[5];
		ReportMessage rm = new ReportMessage();
		data = rm.generateReport(data);
		
		for(int i = 0; i< data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
	}
	
	void work() {
		System.out.println("..factory work");
	}
	
	void sendReport() {
		System.out.println("..report sending");
	}
	
	void sendLogs() {
		System.out.println("..logs sending");
	}
	/* generator and sender messages to service */
	
	void executeHTTP(String targetURL, String urlParameters) {
		 
		}
}

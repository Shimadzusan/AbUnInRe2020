import java.util.Random;

class ReportMessage {
	
	int generateData() throws InterruptedException {
		System.out.println("..generating data");
		Thread.sleep(3000);
		
		Random r = new Random();
		int data = r.nextInt(9);
		return data;
	}
	
	int[] generateReport(int[] report) throws InterruptedException {
		//int[] x = {};
		for(int i = 0; i < report.length; i++) {
			report[i] = generateData();
		}
		return report;
	}

}

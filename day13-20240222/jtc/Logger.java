






class Logging {

	static int count = 0;
	
	static void info(String msg) {
		System.out.println("\033[1;32mINFO:\033[0m " + msg);
		count = count + 1;
	}
	
	static void error(String msg) {
		System.out.println("\033[1;31mERROR:\033[0m " + msg);
	}

	static int getExecutionCount() {
		return count;
	}
}

public class LoggingMain {
	public static void main(String[] args) {
		Logging.info("This is informational");
		Logging.info("This is informational");
		Logging.info("This is informational");
		Logging.info("This is informational");
		Logging.info("total logs = " + Logging.getExecutionCount());
	}
}


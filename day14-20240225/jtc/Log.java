package jtc;
public class Log {
	public static void info(String msg) {
		System.out.println("\033[1;32mINFO:\033[0m " + msg);
	}
	
	public static void error(String msg) {
		System.out.println("\033[1;31mERROR:\033[0m " + msg);
	}
}






package math;
public class MyMathLib {

	public static long factorial(int num) {
		long f = 1;
		for(int i = 1; i <= num; i ++) {
			f = f * i;
		}
		return f;
	}
	
	long abs(long num) {
		return num < 0 ? -num : num;
	}
	
	long pow(int base, int exp) {
		return 0;
	}
	
	long max(long... numbers) {
		long letMax = numbers[0];
		for(int i = 1; i < numbers.length; i ++) {
			//if(
		}
		return letMax;
	}
	
}


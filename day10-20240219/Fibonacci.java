



public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = a + b;
		int sum = 2; // already add the initial value (b = 2)
		//for(; c <= 100;) {
		while(c <= 4000000) {
			if(c % 2 == 0) {
				sum = sum + c;
			}
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(sum);
	}
}


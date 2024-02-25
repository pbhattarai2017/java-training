




package jtc;
public class Math {
	
	public long min(long... numbers) {
		long letMin = numbers[0];
		for(int i = 1; i < numbers.length; i ++) {
			if(numbers[i] < letMin) {
				letMin = numbers[i];
			}
		}
		return letMin;
	}
	
}


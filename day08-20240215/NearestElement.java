





class NearestElement {

	// Write a method (function) to calculate mathematical
	// absolute value of an integer.
	// also called modulus of an integer
	public static int absolute(int number) {
		if(number < 0) {
			number = -number;
		}
		return number;
	}
	
	public static void main(String[] args) {
		int[] arr = {28,2,-3,10,-20,32,91,-1,42,17,29,4};		

		int size = arr.length;
		int n = 5;
	
		
		int diff;
		
		// for keeping track of actual ner
		int assumed_nearest_element = arr[0];
		//value of assumed_nearest_element : 28
		int assumed_minimum_difference = 23;
		
		for(int i = 0; i < size; i ++) {
			diff = absolute(arr[i] - n);
			
			// which opeartor is used here?
			// = assignment operator
			//diff = absolute(diff);
			
			/* we have used absolute() instead
			if(diff < 0) {
				// here diff is negative, lets make it positive
				diff = -diff;
			}
			// here, we always have positive difference	
			// 
			// we used the following logic when finding
			// smallest element of an array
			System.out.printf("Checking if (diff: %d < assumed: %d)\n",
				diff,
				assumed_minimum_difference);
				*/
			if(diff < assumed_minimum_difference) {
			//System.out.printf("\tassumed_minimum_diff updated: value = %d\n", diff);
			assumed_minimum_difference = diff;
			assumed_nearest_element = arr[i];
			}
			
			//System.out.printf("arr[%d](%d) - %d = %d\n"
			//,i , arr[i], n, diff);
		}
		
		// outside the loop
		System.out.printf("minimum difference = %d\n", assumed_minimum_difference);
		System.out.printf("But, the nearest element = %d\n",
			assumed_nearest_element);
	}
}

public class ModeValue {
	public static void main(String[] args) {
	
		// Make sure the array is sorted
		int[] arr = { 1,2,3,3,3,3,3,3,4,4,5,5,5,6,99,100,100,100,100,100 };
		
		int running_count = 1;
		int current_val = arr[0];
	
		//assumptions for comparison
		int maxcount = running_count;
		int mode = current_val;
		int len = arr.length;
		
		for(int i = 1; i < len; i ++) {
			if(arr[i] == current_val) {
				running_count ++;
			} else {
				if(running_count > maxcount) {
					maxcount = running_count;
					mode = current_val;
				}
				running_count = 1;
				current_val = arr[i];
			}
		}
		if(running_count > maxcount) {
			maxcount = running_count;
			mode = current_val;
		}
		
		System.out.printf("The mode is %d with frequency %d\n", mode, maxcount);
	}
}


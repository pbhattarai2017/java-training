package jtc;
public class Search {

	/// This method returns the index of found element
	/// -1 if not found
	public static int linearSearch(int[] arr, int searchKey) {
		for(int i = 0; i < arr.length; i ++) {
			Log.info("Searching at " + i);
			if(arr[i] == searchKey) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int searchKey) {
		// only sorted array are used in binary search
		// Try to complete the method implementation
		int left_index = 0;
		int right_index = arr.length - 1;
		int midIndex;
		while(left_index <= right_index) {
			midIndex = (left_index + right_index) / 2;
			Log.info("Searching at " + midIndex);
			if(arr[midIndex] == searchKey) {
				return midIndex;
			} else if(searchKey > arr[midIndex]) {
				left_index = midIndex + 1;
			} else {
				right_index = midIndex - 1;
			}
		}
		return -1;
	}
}

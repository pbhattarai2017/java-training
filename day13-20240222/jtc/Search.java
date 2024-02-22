




package jtc;
public class Search {
	
	public static int linearSearch(int[] arr, int searchKey) {
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == searchKey) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int searchKey) {
		// only sorted array are used in binary search
		// Try to complete the method implementation
		int midValue = arr[arr.length / 2];
		System.out.println(midValue);
		return 0;
	}
}

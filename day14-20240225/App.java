import jtc.Search;
import jtc.Log;

public class App {
	public static void main(String[] args) {
		// BINARY SEARCH
		int[] arr = {10, 27, 32, 40, 60, 79, 110, 150, 164, 
			168, 179, 193, 235, 237, 277, 281, 313, 326, 330, 
			334, 346, 351, 378, 381, 386, 386, 388, 400, 402,
			423, 423, 423, 423, 431, 432, 445, 448, 456, 462,
			467, 490, 499, 500, 528, 551, 560, 572, 576, 579,
			581, 596, 602, 607, 615, 618, 618, 621, 654, 659,
			660, 664, 680, 685, 690, 692, 709, 710, 716, 734,
			734, 738, 742, 750, 750, 751, 802, 818, 831, 832,
			845, 850, 863, 872, 873, 876, 881, 881, 884, 887,
			894, 900, 918, 945, 951, 959, 963, 964, 987, 995};

		int searchKey = 884;
	
		//int found_index = Search.linearSearch(arr, searchKey);
		int found_index = Search.binarySearch(arr, searchKey);
		
		if(found_index == -1) {
			System.out.printf("%d not found\n", searchKey);
		} else {
			System.out.printf("%d found at %d\n", searchKey, found_index);
		}
	}
}


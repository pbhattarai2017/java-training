






import java.util.Scanner;
import jtc.Search;
public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
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

		//Get a number from user and check if it is in the array
		System.out.print("Enter a number to search: ");	
		int searchKey = input.nextInt();

		/* Linear Search
		int found = Search.linearSearch(arr, searchKey);
		if(found == -1) {
			System.out.printf("%d not found\n", searchKey);
		} else {
			System.out.printf("found at index %d\n", found);
		} 
		*/
		int[] smallArray = { 1, 4, 5, 8, 10, 12 };
		Search.binarySearch(smallArray, searchKey);	
	}
}








import jtc.Math;
import jtc.Str;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// use a library method from jtc.Math
		Math m = new Math();
		long minVal = m.min(0, 1, 5, -10);
		System.out.println("Minimum value: " + minVal);
		
		
		// use Str.isPalindrome() to check if a word is palindrome
		Str str = new Str();
		Scanner input = new Scanner(System.in);
		System.out.println("Palindrome checker");
		System.out.print("Enter a word: ");
		String word = input.next();
		
		if(str.isPalindrome(word)) {
			System.out.println("Is palindrome");
		} else {
			System.out.println("Is not palindrome");
		}
	}
}


import java.util.Scanner;

public class VowelCheck {  
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	
		// in Java language
		System.out.print("Enter a word: ");
		
		// in C language
		char word[20];	
		printf("Enter a word: ");
		scanf("%s", word);
		scanf("%d", &number);
		
		
		String word = keyboard.next();		// like %s
		int number = keyboard.nextInt();
		for(int i = 0; i < word.length(); i ++) {
			System.out.println(word.charAt(i));
		}
		
		
	}
}

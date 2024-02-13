


import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = keyboard.nextInt();
		int fact = 1;
		for(int i = 1; i <= n; i ++) fact = fact * i;
		System.out.println("Factorial = " + fact);	
		
		//Task: if user gives negative integers; print
		//	"Factorial of negative number is undefined"
		//	else print the factorial
	}
}

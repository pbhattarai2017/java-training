import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    // Task
    // get a number from keyboard
    // prints its multiplication table
    // 7 x 1 = 7
    // 7 x 2 = 14
    // String name = "Multipication table for 7";
   
    //try this code
    // String fullName = "John" + "Doe";
    // // "John" + "Doe" = "JohnDoe"
    // System.out.println(fullName);
    // System.out.println("Greetings! " + fullName);
    
    // OUTPUT ?
    // JohnDoe
    // Greetings! JohnDoe
   
    // is number * i == i * number ?

    // True or False ?
    // a + b == b + a ? 
    // what if a and b are strings?
    
    // type these two lines ditto
    // remember this line for upcoming classes
    Scanner keyboard = new Scanner(System.in);
   
    // this line takes an integer from keyboard
    // and saves it to number variable
    int number = keyboard.nextInt();
    
     for(int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", 
        number, i, number * i);
      
      // this is not add operator   ^
      // it is called concatenation operator
     }
  }
}
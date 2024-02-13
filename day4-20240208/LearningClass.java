



// a class is a user-defined data type
// just like struct in C language
class Laptop {
	public String model;
	public double price;
	public boolean has4KScreen;
}
public class LearningClass {
	public static void main(String[] args) {
		Laptop hp = new Laptop();
		Laptop dell = new Laptop();
		
		hp.model = "Pavilion";
		hp.price = 80000;
		hp.has4KScreen = true;
		
		dell.model = "Inspiron";
		dell.price = 70000;
		dell.has4KScreen = false;
		
		System.out.println(hp.hashCode());		
		System.out.println(dell.hashCode());		
	}
}

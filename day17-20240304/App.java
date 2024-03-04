



class Animal {
	String name;
}
class Car {
	String model;
}

public class App {

	public static boolean isObjectNull(Object obj) {
		return obj == null;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(isObjectNull(animal));
	
		Car car = new Car();
		System.out.println(isObjectNull(car));
		
	}
}


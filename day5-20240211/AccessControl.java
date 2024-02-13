


class Animal {
	// these are fields
	public String name;
	public String type;
	private String id;

	// this is a method
	public String getName() {
		return name; 
	}
	// try calling this method
	// error occurs when accessed from outside the class
	private String getType() {
		return type;
	}
	
	// Look Constructor in java
}

public class AccessControl {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.name = "Cat";
		cat.type = "Mammal";
		Animal eagle = new Animal();
		eagle.name = "Eagle";
		eagle.type = "Avian";
		System.out.println(cat.getName());
		System.out.println(eagle.getName());
	}
}

class Student{
	String name;
	int age;
	
	public void printInfo(String name, int age) {
		System.out.println("My name is " + name + " and I am " + age);
	}
	
	public void printInfo(String name) {
		System.out.println("My name is " + name);
	}
	
	public void printInfo(int age) {
		System.out.println("I am " + age);
	}
}

public class polymorphism {
public static void main (String[] args) {
	Student me = new Student();
	me.name = "Pranay";
	me.age = 21;
	
	  me.printInfo(me.name,me.age);
	 // me.printInfo(me.age);
	//  me.printInfo(me.name);
    }
}
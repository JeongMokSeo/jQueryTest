package inheritance;

public class Parent {

	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public Parent(String name) {
		System.out.println("Parent(String name) constructor");
	}
	
	public Parent(Inheritance obj) {
		System.out.println("Parent(Inheritance obj) constructor");
	}
	
	public void printName() {
		System.out.println("printName() - Parent");
	}
	
	
}

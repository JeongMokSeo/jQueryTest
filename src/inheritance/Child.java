package inheritance;

public class Child extends Parent{
	
	public Child() {
		System.out.println("Child constructor");
	}
	
	public void printAge() {
		System.out.println("printAge() - 5 years");
	}
	
	public void printName() {
		System.out.println("printName() - Child");
	}
	
}

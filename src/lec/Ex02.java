package lec;

public class Ex02 {

	static int data = 1;
	
	public Ex02() {
		System.out.println("StaticBlock Constructor is called");
	}
	
	static {
		System.out.println("=> Static block1");
		data=3;
	}
	static {
		System.out.println("=> Static block2");
		data=5;
	}
	public static int getData() {
		return data;
	}
	
}

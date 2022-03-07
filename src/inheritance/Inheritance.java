package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child child = new Child();
		//child.printName();

		//Parent parent = new Parent();
		//Parent obj1 = new Child();
		//Child obj2 = new Parent();  //X
		
		Inheritance obj = new Inheritance();
		//obj.objCast2();
		obj.callPrintname();
		
	}
	
	public void objCast() {
		Parent parent = new Parent();
		Child child = new Child();
		
		Parent parent2 = child;
		Child child2 = (Child)parent2;	
	}
	
	public void objCast2() {
		Parent[] parentArray = new Parent[3];
		parentArray[0] = new Child();
		parentArray[1] = new Parent();
		parentArray[2] = new Child();   //instanceof  속성
		
		System.out.println("--------------------------------");
		for (Parent temp : parentArray) {
			if (temp instanceof Child) {
				System.out.println("Child Type");
				Child tempChild = (Child) temp;
				tempChild.printAge();
			} else if (temp instanceof Parent) {
				System.out.println("Parent Type");				
			}
		}	
	}
	
	
	public void callPrintname() {

		// 다형성
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new ChildOther(); 
		
		parent1.printName();
		parent2.printName();
		parent3.printName();
		
		
	}
	
	

}

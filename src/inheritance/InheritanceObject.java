package inheritance;

public class InheritanceObject {

	public static void main(String[] args) {
		InheritanceObject obj = new InheritanceObject();
		//obj.toStringMethod(obj);
		//System.out.println("--------------------------");
		//obj.toStringMethod2();
		obj.equalMethod();

	}
	
	//toString  System.out.println(~~), 객체의 + 연산
	public void toStringMethod(InheritanceObject iobj) {
		
		System.out.println(iobj);
		System.out.println(iobj.toString());
		System.out.println("plus :" + iobj);
	}
	public void toStringMethod2() {
		
		System.out.println(this);
		System.out.println(toString());
		System.out.println("plus :" + this);
	}

	public String toString() {
		
		return "InheritanceObject";
	}
	
	public void equalMethod() {
		// ==  !=  equals()
		MemberDTO dto1 = new MemberDTO("Tom");
		MemberDTO dto2 = new MemberDTO("Tom");
		
		//if (dto1 == dto2) {
		if (dto1.equals(dto2)) {  // hashcode
			System.out.println("dto1 and dto2 is same");
		} else {
			System.out.println("dto1 and dto2 is difference");
		}

		
	}
	
}

package annot;
import inheritance.Parent;

public class AnnotChild extends Parent {

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("AnnotChild");
	}
	
	@Deprecated
	public void noMoreUse() {
		
	}

	
}

package annot;

public class AnnotationTest {
	
	@SuppressWarnings("deprecation")  // 에러 알고 있다.
	public void useDeprecaated() {
		AnnotChild child = new AnnotChild();
		child.noMoreUse();
	}

}

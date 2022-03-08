package annot;

import java.lang.reflect.Method;

public class UserAnnotationTest {

	@UserAnnotation(number = 0)
	public static void main(String[] args) {
		UserAnnotationTest test = new UserAnnotationTest();
		test.checkAnnotation(UserAnnotationTest.class);
	}
	
	private void checkAnnotation(Class<UserAnnotationTest> useClass) {
		
		Method[] methods = useClass.getDeclaredMethods();  // 클래스에 선언되어 있는 메서드 목록을 배열형태로 반환
		
		for (Method tempM : methods) {
			UserAnnotation annotation = tempM.getAnnotation(UserAnnotation.class);
			if (annotation !=null) {
				int number = annotation.number();
				String text = annotation.text();
				System.out.println(tempM.getName() + "(): number=" + number + ", text=" + text );
			} else {
				System.out.println(tempM.getName() + "() : annotation is null.");
			}
		}
		
	}

	@UserAnnotation(number = 1)
	public void annotationTest1() {
		
	}
	@UserAnnotation(number = 2, text = "second")
	public void annotationTest2() {
		
	}
	@UserAnnotation(number = 3, text="third")
	public void annotationTest3() {
		
	}
	
}

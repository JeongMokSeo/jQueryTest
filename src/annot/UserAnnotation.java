/*
 *  메타 어노테이션
 *  @Target : CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD...
 *  @Retention : SOURCE, CLASS, RUNTIME
 *  @Documented : 이 어노테이션에 대한 정보가 자바API문서 자체에 포함된다는 것을 선언
 *  @Inherited : 모든 자식클래스에서 부모의 어노테이션을 사용할수 있다 선언.
 */


package annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotation {  //  사용할때  @UserAnnotation 으로 사용
	public int number();
	
	public String text() default "This is user annotation";
}

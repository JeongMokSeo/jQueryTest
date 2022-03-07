package imple;

public class FinalVariable {
	final int instvarible = 9;  //final : 변수를 더 이상 바꿀수 없다.

	public void method1(final int parameter) {
		final int localVariable;
		localVariable = 8;  //초기는 문제없음.
		//localVariable = 9;  //변경시 Error
		//parameter =1;       //변경시 Error
	}
	
}

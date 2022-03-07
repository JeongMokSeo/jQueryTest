package imple;

import inheritance.MemberDTO;

public final class FinalClass {  // final 클래스: 다른 클래스에서 상속받지 못함.  다른개발자가 변경하지 못하도록 함.

	final MemberDTO dto = new MemberDTO();
	
	public static void main(String[] args) {
		FinalClass cls = new FinalClass();
		cls.testDTO();
	}
	
	public void testDTO() {
		System.out.println(dto);
		//dto = new MemberDTO("Tom");
		dto.name = "Tom";
		System.out.println(dto);
	}
}

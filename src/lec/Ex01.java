package lec;

import dto.MemberDto;

public class Ex01 {

	public Ex01() {

	}

	public Ex01(String data) {

	}

	public static void main(String[] args) {

		 Ex01 sample = new Ex01();
		// sample.passByValue(2, "b", new MemberDto("a","123","222@java.com"));
		// sample.calculateNumbers(1,2,3,4,5);

		//MemberDto.staticMethod();
		//sample.checkMemberDtoName();
		//sample.makeStaticBlockObject();
		sample.callPassByValue();
		
	}

	public void makeMemberObject() {
		MemberDto dto1 = new MemberDto();
		MemberDto dto2 = new MemberDto("John2");
		MemberDto dto3 = new MemberDto("John3", "010xxxxxx");
		MemberDto dto4 = new MemberDto("john4", "010xxxxxx", "john@java.com");
	}

	

	public void calculateNumbers(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		System.out.println("Total :" + total);

		MemberDto dto = new MemberDto("John", "010xxxxxxx", "john@java.com");
		System.out.printf("Name: %s Phone:%s E-Mail:%s", dto.name, dto.phone, dto.email);

	}
	
	public void checkMemberDtoName() {
		MemberDto dto1 = new MemberDto("John");
		System.out.println(dto1.name);
		MemberDto dto2 = new MemberDto("Tom");
		System.out.println(dto1.name);
	}
	
	public void makeStaticBlockObject() {
		System.out.println("data :" + Ex02.data);
		System.out.println("Create Ex02 A" );
		Ex02 blockA = new Ex02();
		System.out.println("Create Ex02 blockA");
		System.out.println("Create Ex02 B");
		Ex02 blockB = new Ex02();
		System.out.println("Create Ex02 blockB");
		System.out.println("data :" + Ex02.data);
	}
	
	public void callPassByValue() {
		int a = 10;
		String b = "b";
		MemberDto member = new MemberDto("John");
		passByValue(a, b, member);
		System.out.println("callPassByValue method result:");
		System.out.println("a =: " + a);
		System.out.println("b =: " + b);
		System.out.println("member.name =: " + member.name);
		
	}
	
	
	public void passByValue (int a, String b, MemberDto member) {
		a= 20; 
		b= "z";
		//member = new MemberDto("Tom");
		member.name = "Tom"; 
		System.out.println("passByValue method result : ");
		System.out.println("a =: " + a);
		System.out.println("b =: " + b);
		System.out.println("member.name =: " + member.name);
	}
	
	
}

package dto;

public class MemberDto {
	
	public String name;
	public String phone;
	public String email;
	
	
	public MemberDto() {
		super();
	}

	public MemberDto(String name) {
		super();
		this.name = name;
	}
	
	public MemberDto(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public MemberDto(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	//static 접근권한을 생각해 봐야 한다.
	public static void staticMethod() {
		System.out.println("MemberDto static method");
	}
	
	
	
}

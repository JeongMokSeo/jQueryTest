package imple;
import inheritance.MemberDTO;

public interface MemberManagerInterface {
	
	//public static final 
	int CODE = 1;
	
	//public abstract   <-- 자동선언됨
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);

}

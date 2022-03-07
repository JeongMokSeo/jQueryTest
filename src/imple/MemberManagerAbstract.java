package imple;
import inheritance.MemberDTO;

//추상클래스
public abstract class MemberManagerAbstract {  
	public abstract boolean addMember(MemberDTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(MemberDTO member);

	public void printLog(String data) {
		System.out.println("Data :" + data);
	}
	
}

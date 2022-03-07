package imple;

import inheritance.MemberDTO;

public class MemberManager2 extends MemberManagerAbstract {

	@Override
	public boolean addMember(MemberDTO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeMember(String name, String phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMember(MemberDTO member) {
		// TODO Auto-generated method stub
		return false;
	}


	public void printLog(String data) {
		System.out.println("Data :" + data);
	}
}

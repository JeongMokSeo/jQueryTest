package inheritance;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;

	
	
	public MemberDTO() {
		
	}	
	public MemberDTO(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

	/*
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * super.hashCode(); }
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return super.equals(obj); }
	 */

	@Override
	public boolean equals(Object obj) {

		// 재귀(reflexive) 대칭(symmetric) 타동적(transitive), 일관(consistent), null과의 비교 //
		// x.equals(y) y.equals(z) --> x.equals(z)

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		MemberDTO other = (MemberDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email)) {
			return false;
		}

		// TODO Auto-generated method stub
		return true;
	}

	public int hashCode() { // 객체의 메모리 주소를 16진수로 리턴

		// 애플리케이션 수행동안 동일한 값 //equals() 결과가 true이면 hashCode()는 동일한 int값
		// equals() 결과가 false이면 hashCode()가 달라야 하지는 않음

		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());

		return result;

	}

}

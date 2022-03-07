import inheritance.MemberDTO;

// 참조자료형 실습
// Student 클래스
// 인스턴스변수 String name, address, phone, email
// Student생성자(name)
// Student생성자(모든변수들)
// toString() : name + " " + address + " " + phone + " " + email 반환 

public class Student {
	String name;
	String address;
	String phone;
	String email;
	
	public Student() {
		
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [" + name + " " + address + " " + phone + " " + email + "]";
	}
	
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

		Student other = (Student) obj;
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address)) {
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
		result = prime * result + ((address == null) ? 0 : address.hashCode());

		return result;

	}	
	
}

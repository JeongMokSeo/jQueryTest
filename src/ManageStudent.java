/* ManageStudent클래스
 * main()
 * addStudent(): Student[]에 3개의 객체생성, 반환
 * main에서 addStudnet()호출, 결과를 student객체로 받음
 * printStudent() : for문 사용 student 배열의 내용 출력
 * main()메서드에서 printStudent() 메서드 호출
 */


public class ManageStudent {
	public static void main(String[] args) {
		Student[] student = null;
		ManageStudent obj = new ManageStudent();
		//student = obj.addStudent();
		//obj.printStudent(student);
		obj.equalMethod();
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Tom");
		student[1] = new Student("John");
		student[2] = new Student("Jane","Seoul","010xxxx","Jane@java.com");
		return student; 
	}
	
	public void printStudent(Student[] student) {
		for(Student stud: student) {
			System.out.println(stud);
		}
	}
	
	public void equalMethod() {
		Student a = new Student("Tom" , "Seoul","010xxxxxxx","tom@alzio.co.kr");
		Student b = new Student("Tom" , "Seoul","010xxxxxxx","tom@alzio.co.kr");
		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
			
		}
	}
	
	
}

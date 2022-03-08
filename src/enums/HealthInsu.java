/*
 * HealthInsu클래스 (건강보험 공제비율관리 enum클래스)
 * 비율: 100-1.0, 200-2.0, 300-3.5, 400-4.5, 500-5.5, 600-6.5
 * 생성자(매개변수:해당 등급의 최대연봉, 공제비율)
 *    int maxSalary, double radio
 *    LEVEL_ONE ~ LEVEL_SIX상수를 선언
 * 공제비율 리턴하는 getRatio()   
 * static getHealthInsurance(연봉)해당 enum객체 리턴
 * main 메서드에서 getHealthInsurance(...)  테스트   
 */

package enums;

public enum HealthInsu {
	LEVEL_ONE(100,1.0),
	LEVEL_TWO(200,2.0),
	LEVEL_THREE(300,3.5),
	LEVEL_FOUR(400,4.5),
	LEVEL_FIVE(500,5.5),
	LEVEL_SIX(600,6.5);
	private final int maxSalary;
	private final double ratio;
	
	//enum 접근제어자는 package-private  private만 가능,, 생략시 package-private
	HealthInsu(int maxSalary, double ratio) {   
		this.maxSalary = maxSalary;
		this.ratio = ratio;
	}
	
	public double getRatio() {
		return ratio;
	}
	
	public static HealthInsu getHealthInsurance(int salary) {
		if (salary < 100) {
			return LEVEL_ONE;
		} else if (salary < 200) {
			return LEVEL_TWO;
		} else if (salary < 300) {
			return LEVEL_THREE;
		} else if (salary < 400) {
			return LEVEL_FOUR;
		} else if (salary < 500) {
			return LEVEL_FIVE;
		} else  {
			return LEVEL_SIX;
		}
	}
	
	public static void main(String[] args) {
		
		int salaryArray[] = new int[] {250,520,900};
		HealthInsu[] insurances = new HealthInsu[3];
		insurances[0] = HealthInsu.getHealthInsurance(salaryArray[0]);
		insurances[1] = HealthInsu.getHealthInsurance(salaryArray[1]);
		insurances[2] = HealthInsu.getHealthInsurance(salaryArray[2]);
		
		for (int i = 0; i < insurances.length; i++) {
			System.out.println(salaryArray[i] + "="+insurances[i] + "," + insurances[i].ratio );
		}
	}
}

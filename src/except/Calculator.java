package except;

public class Calculator {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		try {
			calc.divideMethod(1, 2);
			calc.divideMethod(1, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}		
	}
	
	public void divideMethod(double d1, double d2) throws Exception {
		if (d2==0) throw new Exception("Second value is Zero.");		
		double result = d1 / d2;
		System.out.println(result);
	}
}

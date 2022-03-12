package d.util;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimalTest obj = new BigDecimalTest();
		obj.normalDoubleCalc();
		System.out.println("----------------------------------");
		obj.bigDecimalCalc();
		
	}

	private void normalDoubleCalc() {
		double val = 1.0;
		for (int i = 0; i < 10; i++) {
			val += 0.1;
			System.out.println(val);
		}
	}
	
	public void bigDecimalCalc() {
		BigDecimal val = new BigDecimal("1.0");
		BigDecimal val2 = new BigDecimal(1.0);
		BigDecimal addVal = new BigDecimal("0.1");
		BigDecimal addVal2 = new BigDecimal(0.1);
		for (int i = 0; i < 10; i++) {
			val = val.add(addVal);
			System.out.println(val.toString());
		}
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) {
			val2 = val2.add(addVal2);
			System.out.println("val2=" + val2);
		}
		
	}
}

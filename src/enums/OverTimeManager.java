package enums;

public class OverTimeManager {
	
	public static void main(String[] args) {
		/*
		 * OverTimeManager mgr = new OverTimeManager(); //int myAmount =
		 * mgr.getOTAmount(OverTimeValues.THREE_HOUR); OverTimeValues value =
		 * OverTimeValues.THREE_HOUR; int myAmount = mgr.getOTAmount(value);
		 * System.out.println(myAmount);
		 */
		
		OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
		System.out.println(value2);
		System.out.println(value2.getAmount());
		
		OverTimeValues2 value3 = OverTimeValues2.WEEKEND_FOUR_HOUR;
		System.out.println(value2.compareTo(value3)); //  a.compareTo(b) a 가 b 보다 작으면 음수,  크면 양수가 나옴
		
		System.out.println("-------------------");
		OverTimeValues2[] valueList = OverTimeValues2.values();
		for(OverTimeValues2 value : valueList) {
			System.out.println(value);
		}
		
	}
	
	
	
	public int getOTAmount(OverTimeValues value) {
		
		int amount =0;
		System.out.println(value);
		switch (value) {
		case THREE_HOUR:
			amount = 10000;
			break;
		case FIVE_HOUR:
			amount = 30000;
			break;
		case WEEKEND_FOUR_HOUR:
			amount = 50000;
			break;
		case WEEKEND_SIX_HOUR:
			amount = 70000;
			break;
		}
		return amount;
	}
}

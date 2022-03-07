package enums;

public enum OverTimeValues2 {
	// 상수들의 이름만 콤마로 지정해서 서술...
	THREE_HOUR(10000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(50000),
	WEEKEND_SIX_HOUR(70000);
	
	private final int amount;
	
	OverTimeValues2(int amount) {  //접근제어자 생략시, 디볼트 package-private
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
	

}

package d.generic;

public class WildCardTest {
	public static void main(String[] args) {
		WildCardTest obj = new WildCardTest();
		//obj.callWildCardMethod();
		
		//obj.callBoundedWildcardM();
		
		obj.callGenericMethod();
	}

	private void callWildCardMethod() {
		WildCardGen<String> wildcard = new WildCardGen<String>();
		wildcard.setWildcard("A");
		wildcardMethod(wildcard);
	}
	
	public void wildcardMethod(WildCardGen<?> c) {
		Object value =c.getWildcard();
		System.out.println(value);
	}
	
	
	public void callBoundedWildcardM() {
		//WildCardGen<Car> wildcard = new WildCardGen<Car>();
		//wildcard.setWildcard(new Car("BMW"));

		WildCardGen<Bus> wildcard = new WildCardGen<Bus>();
		wildcard.setWildcard(new Bus("RedBus"));
		boundedWildcardM(wildcard);
	}

	public void boundedWildcardM(WildCardGen<? extends Car> c) {
		Car value = c.getWildcard();
		System.out.println(value);
		
	}
	
	public <T> void genericMethod(WildCardGen<T> c, T addVal) {
		c.setWildcard(addVal);
		T val = c.getWildcard();
		System.out.println(val);
	}
	
	public void callGenericMethod() {
		WildCardGen<String> wildcard = new WildCardGen<String>();
		genericMethod(wildcard, "SomeData");
	}
}

package inner;

public class OuterOfStatic {

	static class StaticNested {  //inner클래스
		private int value = 0;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}		
	}
	
	
}

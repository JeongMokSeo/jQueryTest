package inner;

public class NestedValueReference {
	public int publicInt = 0;
	protected int protectedInt = 10;
	int justInt = 20;
	private int privateInt= 30;
	static int staticInt = 40;
	
	public static void main(String[] args) {
		NestedValueReference obj = new NestedValueReference();
		obj.setValue(100);
	}
	
	static class StaticNested {
		private int staticNestedInt = 100;
		public void setValue() {
			 staticInt = 15;
		}
	}
	
	class Inner {
		private int innerInt = 200;
		public void setValue() {
			publicInt = 90;
			protectedInt = 91;
			justInt = 92;
			privateInt = 93;
			staticInt = 94;
		}
	}
	
	public void setValue() {
		EventListener listener = new EventListener() {			
			@Override
			public void OnClick() {
				publicInt = 100;
				protectedInt =101;
				justInt = 102;
				privateInt = 103;
				staticInt = 104;				
			}
		};
	}

	
	public void setValue(int value) {
		StaticNested nested = new StaticNested();
		nested.staticNestedInt = value;
		Inner inner = new Inner();
		inner.innerInt = value;
		System.out.println("nested.staticNestedInt:" + nested.staticNestedInt);
		System.out.println("inner.innerInt:" + inner.innerInt);
	}	
	
}
